package airline.flight.persistence;

import java.util.ArrayList;
import java.util.List;

public class Flight {

    private final String number;
    private final String departureAirportCode;
    private final String arrivalAirportCode;
    private final List<Seat> seats;

    public Flight(String number, String departureAirportCode, String arrivalAirportCode) {
        this.number = number;
        this.departureAirportCode = departureAirportCode;
        this.arrivalAirportCode = arrivalAirportCode;
        this.seats = new ArrayList<>();
    }


    public String getNumber() {
        return number;
    }

    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    public String getArrivalAirportCode() {
        return arrivalAirportCode;
    }

    /**
     * Adds a number of seats to this flight. Every 6th seat will be marked as a window seat.
     *
     * @param startNumber
     * @param count
     * @param type
     */
    void addSeats(int startNumber, int count, SeatType type) {
        // todo
    }


    /**
     * Returns an unmodifiable list of all seats for this flight.
     */
    public List<Seat> getSeats() {
        // todo
        return null;
    }


    /**
     * Returns a list of all seats matching the given criteria, which might be an empty list.
     *
     * @param seatType
     * @param atWindow
     */
    public List<Seat> getAvailableSeatNumber(SeatType seatType, Boolean atWindow) {
        // todo
        return null;
    }

}
