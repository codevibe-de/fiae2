package airline.flight.service;

public class SeatNotAvailableException extends RuntimeException {

    public SeatNotAvailableException(String message) {
        super(message);
    }

}
