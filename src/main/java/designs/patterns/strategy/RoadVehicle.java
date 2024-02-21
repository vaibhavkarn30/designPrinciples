package designs.patterns.strategy;

public class RoadVehicle extends Vehicle {
    public RoadVehicle() {
        super(new NormalDriveStrategy());
    }

}
