package airline.booking.service;

import airline.booking.persistence.BookingJsonRepository;
import airline.flight.service.SeatNotAvailableException;

public class BookingService {

    private final BookingJsonRepository repository;

    public BookingService(BookingJsonRepository repository) {
        this.repository = repository;
    }

    /**
     * Tries to book the given seat for a passenger. Throws SeatNotAvailableException if already taken
     *
     * @throws SeatNotAvailableException
     */
    public void bookSeat(String flightNumber, int seatNumber, String passengerLastName) {
        // todo
    }


    public void printPassengerList(String flightNumber) {

    }

}
