package designs.cabBooking.controller;

import designs.cabBooking.database.CabManager;
import designs.cabBooking.models.Cab;
import designs.cabBooking.models.CabAlreadyExistsException;
import designs.cabBooking.models.Location;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CabController {
    private CabManager cabManager;

    public CabController(CabManager cabManager) {
         this.cabManager = cabManager;
    }
    @PostMapping(name = "/register/cab")
    public ResponseEntity<String> registerCab(final String cabId,final String driverName) throws CabAlreadyExistsException {
        cabManager.registerNewCab(new Cab(cabId,driverName,false,null,null));
        // Calls Cab Manager to add a cab if not present
        return ResponseEntity.ok("SUCCESS");
    }

    @PostMapping(name = "/update/cab/location")
    public ResponseEntity<String> updateCabLocation(final String cabId,final int xCord, final int yCord){
        Location location = new Location(xCord,yCord);
        cabManager.updateCabLocation(cabId,location);
        return ResponseEntity.ok("SUCCESS");
    }

    @PostMapping(name = "/update/cab/availability")
    public ResponseEntity<String> updateCabAvailability(final String cabId,boolean availability) throws CabAlreadyExistsException {
        cabManager.updateCabAvailability(cabId,availability);
        return ResponseEntity.ok("SUCCESS");
    }

}
