package designs.parkingLot;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class OccupancyInfo {

    private int slotStart;

    private int slotEnd;

    private int usedSlots;
}
