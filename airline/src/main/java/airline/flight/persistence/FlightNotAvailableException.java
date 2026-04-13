package airline.flight.persistence;

public class FlightNotAvailableException extends RuntimeException{
    public FlightNotAvailableException(String message) {
        super(message);
    }
}
