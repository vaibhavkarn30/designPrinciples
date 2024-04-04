package designs.cabBooking.models;


import lombok.AllArgsConstructor;
import lombok.Getter;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

@AllArgsConstructor
@Getter
public class Location {
    private int xCord;

    private int yCord;

    public Double distance (Location l) {
        return sqrt( pow(this.xCord - l.xCord, 2) + pow(this.yCord - l.yCord, 2) );
    }
}
