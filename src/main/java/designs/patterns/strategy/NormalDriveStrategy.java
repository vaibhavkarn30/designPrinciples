package designs.patterns.strategy;

import designs.patterns.strategy.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("This is Normal DriveStrategy");
    }
}
