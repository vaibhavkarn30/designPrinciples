package designs.parkingLot;

import lombok.Builder;
import lombok.Data;


/**
 * Contains All Information related to the driver
 */
@Data
@Builder
public class DriverDetails {

    private String driverName;

    private String drivingLicenseId;
}
