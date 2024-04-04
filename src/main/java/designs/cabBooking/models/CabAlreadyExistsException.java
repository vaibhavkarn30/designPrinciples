package designs.cabBooking.models;

public class CabAlreadyExistsException extends Throwable {

    public CabAlreadyExistsException (String message) {
        super(message);
    }
}
