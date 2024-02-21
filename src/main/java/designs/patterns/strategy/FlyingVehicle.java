package designs.patterns.strategy;

public class FlyingVehicle extends Vehicle {
    public FlyingVehicle() {
        super(new SpecialDriveStrategy());
    }
}
