package designs.parkingLot;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SlotDetails {

    private int slotId;

    private boolean isOccupied;


}
