package designs.cabBooking.strategy;

import designs.cabBooking.database.CabManager;
import designs.cabBooking.models.Cab;
import designs.cabBooking.models.Location;
import designs.cabBooking.models.Rider;

import java.util.List;

public class NearestAvailableCabMatchingStrategy implements CabMatchingStrategy{

    private static int maxDistance = 5;
    private CabManager cabManager;

    public NearestAvailableCabMatchingStrategy(CabManager cabManager) {
        this.cabManager = cabManager;
    }
    @Override
    public Cab mathCabsToRider(Rider rider, Location startLocation, Location endLocation) {
        List<Cab> cabList = cabManager.getAllAvailableCabsInAGivenRange(startLocation,5);
       Cab cab =  cabList.get(0);
       cab.setAvailable(false);
       return cab;
    }
}
