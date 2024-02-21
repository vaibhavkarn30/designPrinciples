package designs.patterns.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Vehicle vehicle = new FlyingVehicle();
        vehicle.drive();
    }
}
