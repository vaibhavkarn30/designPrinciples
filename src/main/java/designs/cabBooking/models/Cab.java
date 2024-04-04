package designs.cabBooking.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class Cab {
    private String id;

    private String driverName;

    @Setter
    private boolean isAvailable;

    @Setter
    private Location currentLocation;

    @Setter
    private Trip currentTrip;


}
