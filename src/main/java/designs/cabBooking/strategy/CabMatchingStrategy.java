package designs.cabBooking.strategy;

import designs.cabBooking.models.Cab;
import designs.cabBooking.models.Location;
import designs.cabBooking.models.Rider;

public interface CabMatchingStrategy {
     Cab mathCabsToRider (Rider rider, Location startLocation, Location endLocation);
}
