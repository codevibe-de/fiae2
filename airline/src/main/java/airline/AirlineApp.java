package airline;

import airline.booking.persistence.Booking;
import airline.booking.persistence.BookingJsonRepository;
import airline.flight.persistence.Flight;
import airline.flight.persistence.FlightJsonRepository;
import airline.flight.persistence.SeatType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirlineApp {

    public static void main(String[] args) throws IOException {
        Flight fraToRome = new Flight("LF001", "FRA", "FCO");
        fraToRome.addSeats(1, 10, SeatType.FIRST);
        fraToRome.addSeats(11, 20, SeatType.BUSINESS);
        fraToRome.addSeats(31, 200, SeatType.ECONOMY);

        // Peter Fox is booking his usual first class seat
        fraToRome.bookSeat(1, "FOX");

        // Enrico wants to fly business class with a view
        int seatNumber = fraToRome.getAvailableSeatNumber(SeatType.BUSINESS, true);
        fraToRome.bookSeat(seatNumber, "PALLAZZO");

        // Family Mustermann flies economy
        for (int n=0; n<4; n++) {
            seatNumber = fraToRome.getAvailableSeatNumber(SeatType.ECONOMY, null);
            fraToRome.bookSeat(seatNumber, "MUSTERMANN");
        }

        // All seats booked!
        fraToRome.printPassengerList();

        //save flight
        FlightJsonRepository repo = new FlightJsonRepository();
        List<Flight> flights = new ArrayList<>();
        flights.add(fraToRome);

        BookingJsonRepository repoBook = new BookingJsonRepository();
        List<Booking> bookings = new ArrayList<>();

        repo.saveFlights("C:\\Data\\Flights", "flights.json", flights);
        repoBook.saveBookings("C:\\Data\\Bookings", "bookings.json", bookings);

        List<Flight> loadedFlights =
                repo.loadFlights("C:\\Data\\Flights", "flights.json");

        System.out.println("Loaded flights: " + loadedFlights.size());
        for (Flight f : loadedFlights) {
            System.out.println("Flight " + f.getNumber());
            f.printPassengerList();
        }

    }
}
