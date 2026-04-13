package airline;

import airline.flight.persistence.Flight;
import airline.flight.persistence.FlightJsonRepository;
import airline.seat.persistence.SeatType;

public class AirlineApp {

    public static void main(String[] args) {
        Flight fraToRome = new Flight("LF001", "FRA", "FCO");
        Flight fraToRome1 = new Flight("LF001", "FRA", "FCO");
        FlightJsonRepository.save(fraToRome);
        FlightJsonRepository.save(fraToRome1);
        System.out.println(FlightJsonRepository.findAll());
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
    }
}
