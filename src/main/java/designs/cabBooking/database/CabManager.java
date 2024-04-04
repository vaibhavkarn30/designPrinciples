package designs.cabBooking.database;

import designs.cabBooking.models.Cab;
import designs.cabBooking.models.CabAlreadyExistsException;
import designs.cabBooking.models.Location;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


public class CabManager {

    private HashMap<String,Cab> cabs= new HashMap<String, Cab>();

    public void registerNewCab(Cab cab) throws CabAlreadyExistsException {
        if(cabs.containsKey(cab.getId())) {
          throw new CabAlreadyExistsException("cab already present with cabId");
        }
        cabs.put(cab.getId(),cab);
    }

    public void updateCabLocation(String cabId, Location newLocation) {
       cabs.get(cabId).setCurrentLocation(newLocation);
    }

    public void updateCabAvailability(String cabId,boolean availability) {
        cabs.get(cabId).setAvailable(availability);
    }

    public List<Cab> getAllAvailableCabsInAGivenRange(Location startLocation, int maxDistance) {
        return cabs.entrySet().stream().filter(e -> e.getValue().isAvailable() && e.getValue().getCurrentLocation().distance(startLocation)<maxDistance)
                .map(e->e.getValue())
                .collect(Collectors.toList());

    }

    public Cab getCab(String cabId) {
        return cabs.get(cabId);
    }


}
