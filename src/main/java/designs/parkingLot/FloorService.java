package designs.parkingLot;

import java.util.Map;

public class FloorService {

    public void createNewFloor(int floorId, int totalSlots, Map<SlotType,OccupancyInfo> occupancyMap) {
        Floor floor = new Floor();

        floor.setFloorId(floorId);
        floor.setSlotTypeOccupancyInfoMap(occupancyMap);

        boolean [] slotAvailabilityInfo = new boolean[totalSlots];


        for(int i =0;i<totalSlots;i++) {
            slotAvailabilityInfo[i] = true;
        }

        floor.setSlotAvailabilityInfo(slotAvailabilityInfo);
    }

}
