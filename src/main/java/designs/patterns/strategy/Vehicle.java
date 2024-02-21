package designs.patterns.strategy;

import designs.patterns.strategy.DriveStrategy;

public class Vehicle {
         private DriveStrategy driveStrategy;
         public Vehicle(DriveStrategy obj) {
             this.driveStrategy = obj;
         }
         void drive() {
             driveStrategy.drive();
         }
}
