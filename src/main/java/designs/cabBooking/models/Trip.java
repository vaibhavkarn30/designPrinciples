package designs.cabBooking.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Trip {
    private Rider rider;

    private Cab cab;

    private Location startLocation;

    private Location dropLocation;

    private double price;

    private TripStatus tripStatus;

    public void endTrip() {
        this.tripStatus = TripStatus.COMPLETE;
    }
}

