package designs.cabBooking.controller;

import designs.cabBooking.database.RiderManager;
import designs.cabBooking.database.TripManager;
import designs.cabBooking.models.Trip;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RidersController {

    private RiderManager riderManager;

    private TripManager tripManager;

    public RidersController(RiderManager riderManager,TripManager tripManager) {
        this.riderManager = riderManager;
        this.tripManager = tripManager ;
    }
    @PostMapping(value = "/register/rider")
    public ResponseEntity<String> registerRider(final String riderId,final String riderName){
        riderManager.registerRider(riderId,riderName);
        return ResponseEntity.ok("SUCCESS");
    }

    @PostMapping(value = "/book/ride")
    public ResponseEntity<Trip> bookTrip(final String riderId, final int currX, final int currY, final int destX, final int destY){
       return new ResponseEntity<>(tripManager.createATrip(riderId,currX,currY,destX,destY), HttpStatus.OK);
    }

}
