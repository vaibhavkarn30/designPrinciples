package designs.cabBooking.strategy;

import designs.cabBooking.models.Location;

public interface PriceMatchingStrategy {
    Double calculatePrice(Location startPoint, Location Endpoint);

}
