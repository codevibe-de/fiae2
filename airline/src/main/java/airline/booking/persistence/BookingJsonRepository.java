package airline.booking.persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookingJsonRepository {
    private ObjectMapper mapper = new ObjectMapper();

    public BookingJsonRepository() {
        this.mapper = mapper;
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    private final List<Booking> bookings = new ArrayList<>();

    public void save(Booking booking) {
        bookings.add(booking);
    }

    public void saveBookings(String directory, String filename, List<Booking> bookings) throws IOException {
        File output = new File(directory, filename);
        output.getParentFile().mkdirs();
        mapper.writeValue(output, bookings);
        System.out.println("Bookings saved to: " + output.getAbsolutePath());
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
