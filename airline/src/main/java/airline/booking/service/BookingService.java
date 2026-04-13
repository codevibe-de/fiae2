package airline.booking.service;

import airline.booking.persistence.Booking;
import airline.booking.persistence.BookingRepository;
import airline.flight.persistence.SeatType;

public class BookingService {

    private final BookingRepository repository;

    public BookingService(BookingRepository repository) {
        this.repository = repository;
    }


    /**
     * Tries to book a seat for a passenger. Throws SeatNotAvailableException if no seat is available for the
     * given criteria.
     *
     * @throws SeatNotAvailableException
     */
    public Booking bookSeat(String flightNumber, SeatType seatType, Boolean atWindow, String passengerLastName) {
        // todo
        return null;
    }


    public void printPassengerList(String flightNumber) {
    }

}
