package designs.cabBooking.strategy;

import designs.cabBooking.models.Location;

public class DistanceBasedPriceMatchingStrategy implements PriceMatchingStrategy{

    @Override
    public Double calculatePrice(Location startPoint, Location Endpoint) {
        return 100.0;
    }
}
