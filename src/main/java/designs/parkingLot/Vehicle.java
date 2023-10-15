package designs.parkingLot;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Vehicle {

    private int vehicleId;

    private VehicleType vehicleType;

    private DriverDetails driverDetails;
}
