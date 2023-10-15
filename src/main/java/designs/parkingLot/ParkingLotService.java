package designs.parkingLot;


public class ParkingLotService {

    public void createParkingLot () {

         System.out.println("Creating a Parking Building For You with 2 floors");

         ParkingBuilding parkingBuilding = new ParkingBuilding(2);

        System.out.println("Adding 2 Floors for you");

        Floor floor = new Floor(1,10);




    }

}
