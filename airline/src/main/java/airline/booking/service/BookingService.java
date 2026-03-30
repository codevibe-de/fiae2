package airline.booking.service;

import airline.booking.persistence.Booking;
import airline.booking.persistence.BookingJsonRepository;
import airline.flight.service.SeatNotAvailableException;

import java.util.List;

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
        List<Booking> existingBookings = repository.findByFlightNumber(flightNumber);
        boolean alreadyBooked = false;
        for (Booking b : existingBookings) {
            if (b.getSeatNumber() == seatNumber) {
                alreadyBooked = true;
                break;
            }
        }
        if (alreadyBooked) {
            throw new SeatNotAvailableException(
                    "Sitz " + seatNumber + " auf Flug " + flightNumber + " ist bereits belegt."
            );
        }
        repository.save(new Booking(flightNumber, seatNumber, passengerLastName));
    }


    public void printPassengerList(String flightNumber) {
        List<Booking> bookings = repository.findByFlightNumber(flightNumber);
        System.out.println("=== Passagierliste für den Flug " + flightNumber + " ===");
        for (Booking b : bookings) {
            System.out.println("Sitz " + b.getSeatNumber() + " | " + b.getPassengerLastName());
        }

    }
}


