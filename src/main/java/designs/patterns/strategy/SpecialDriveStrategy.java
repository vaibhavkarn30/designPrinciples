package designs.patterns.strategy;

import designs.patterns.strategy.DriveStrategy;

public class SpecialDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("This is Special Drive Strategy");
    }
}
