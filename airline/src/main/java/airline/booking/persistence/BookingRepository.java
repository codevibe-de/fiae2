package airline.booking.persistence;

import java.util.List;

public interface BookingRepository {

    Booking save(Booking booking);

    List<Booking> findByFlightNumber(String flightNumber);

}
