package airline.flight.persistence;

import airline.flight.service.SeatNotAvailableException;

import java.util.ArrayList;
import java.util.List;

public class Flight {

    private final String number;
    private final String departsFrom;
    private final String arrivesAt;
    private final List<Seat> seats;

    public Flight(String number, String departsFrom, String arrivesAt) {
        this.number = number;
        this.departsFrom = departsFrom;
        this.arrivesAt = arrivesAt;
        this.seats = new ArrayList<>();
    }


    public String getNumber() {
        return number;
    }


    /**
     * Adds a number of seats to this flight. Every 6th seat is at a window.
     *
     * @param startNumber
     * @param count
     * @param type
     */
    public void addSeats(int startNumber, int count, SeatType type) {
        // todo
    }


    /**
     * Tries to find a seat matching the given criteria. Throws SeatNotAvailableException if none found
     *
     * @param seatType
     * @param atWindow
     * @throws SeatNotAvailableException
     */
    public int getAvailableSeatNumber(SeatType seatType, Boolean atWindow) {
        // todo
        return -1;
    }


}
