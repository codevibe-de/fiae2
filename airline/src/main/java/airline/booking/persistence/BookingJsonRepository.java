package airline.booking.persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookingJsonRepository {

    private final List<Booking> bookings = new ArrayList<>();

    public void save(Booking booking) {
        bookings.add(booking);
    }

    public List<Booking> findByFlightNumber(String flightNumber) {
        List<Booking> result = new ArrayList<>();

        for (Booking b : bookings) {
            if (b.getFlightNumber().equals(flightNumber)) {
                result.add(b);
            }
        }
        return result;
    }

    public void delete(Booking booking) {
        Booking toDelete = null;
        for (Booking b : bookings) {
            if (b.getFlightNumber().equals(booking.getFlightNumber())
                    && b.getSeatNumber() == booking.getSeatNumber()) {
                toDelete = b;
                break;
            }
        }
        if (toDelete != null) {
            bookings.remove(toDelete);
        }
    }
}
