package designs.parkingLot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * Contains all information related to Floor
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Floor {

    private int floorId;

    private int totalSlots;

    private boolean [] isSlotAvailable;

    private Map<SlotType,OccupancyInfo> slotTypeOccupancyInfoMap;

    public Floor(int floorId, int totalSlots) {

        floorId= floorId;
        totalSlots = totalSlots;
        slotTypeOccupancyInfoMap = null;
        isSlotAvailable= new boolean[totalSlots];
        initialise() ;
    }

    private void initialise() {
        for(int i=0;i<totalSlots;i++) {
            isSlotAvailable[i] = true;
        }

    }




}
