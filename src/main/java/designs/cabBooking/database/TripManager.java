package designs.cabBooking.database;

import designs.cabBooking.models.Cab;
import designs.cabBooking.models.Location;
import designs.cabBooking.models.Rider;
import designs.cabBooking.models.Trip;
import designs.cabBooking.models.TripStatus;
import designs.cabBooking.strategy.CabMatchingStrategy;
import designs.cabBooking.strategy.PriceMatchingStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TripManager {

    private HashMap<String, List<Trip>> trips = new HashMap();

    private RiderManager riderManager;

    private CabMatchingStrategy cabMatchingStrategy;

    private PriceMatchingStrategy priceMatchingStrategy;

    private CabManager cabManager;

    public TripManager(RiderManager riderManager,CabMatchingStrategy cabMatchingStrategy,PriceMatchingStrategy priceMatchingStrategy, CabManager cabManager) {
        this.cabMatchingStrategy = cabMatchingStrategy;
        this.priceMatchingStrategy = priceMatchingStrategy;
        this.riderManager = riderManager;
        this.cabManager = cabManager;
    }

    public Trip createATrip(final String riderId, final int currX, final int currY, final int destX, final int destY) {

        Rider rider = riderManager.getRider(riderId);

        Cab cab = cabMatchingStrategy.mathCabsToRider(rider,new Location(currX,currY),new Location(destX,destY));

        Double price = priceMatchingStrategy.calculatePrice(new Location(currX,currY),new Location(destX,destY));

        Trip trip = new Trip(rider,cab,new Location(currX,currY),new Location(destX,destY),price, TripStatus.PROGRESS);

        cab.setCurrentTrip(trip);
        if(!trips.containsKey(riderId)) {
            ArrayList<Trip> tripRider = new ArrayList<>();
            tripRider.add(trip);
        } else {
            trips.get(riderId).add(trip);
        }

        return trip;
    }

    public void endTrip(String cabId) {
        Cab cab = cabManager.getCab(cabId);
        cab.setAvailable(true);
        cab.setCurrentTrip(null);
    }
}
