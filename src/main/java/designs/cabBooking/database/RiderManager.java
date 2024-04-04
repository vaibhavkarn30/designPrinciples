package designs.cabBooking.database;

import designs.cabBooking.models.Cab;
import designs.cabBooking.models.Rider;

import java.util.HashMap;
import java.util.Map;

public class RiderManager {
    private Map<String, Rider> rider= new HashMap<String, Rider>();

    public void registerRider(String riderId,String riderName) {
        rider.put(riderId,new Rider(riderId,riderName));
    }

    public Rider getRider(String riderId) {
        return rider.get(riderId);
    }

}
