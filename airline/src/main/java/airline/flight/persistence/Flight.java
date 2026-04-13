package airline.flight.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import airline.seat.persistence.Seat;
import airline.seat.persistence.SeatType;
import airline.seat.service.SeatNotAvailableException;

public class Flight {

    private final String number;
    private final String departsFrom;
    private final String arrivesAt;
    private final List<Seat> seats;
    private final HashMap<Integer, String> passengerMap;

    public Flight(String number, String departsFrom, String arrivesAt) {
        this.number = number;
        this.departsFrom = departsFrom;
        this.arrivesAt = arrivesAt;
        this.seats = new ArrayList<>();
        this.passengerMap = new HashMap<>();

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

        for (int i = 0; i <= count; i++) {
            if (i % 6 == 0) {
                this.seats.add(new Seat(startNumber + i, true, type));
            } else {
                this.seats.add(new Seat(startNumber + i, false, type));
            }
        }
    }


    /**
     * Tries to find a seat matching the given criteria. Throws SeatNotAvailableException if none found
     *
     * @param seatType
     * @param atWindow
     * @throws SeatNotAvailableException
     */
    public int getAvailableSeatNumber(SeatType seatType, Boolean atWindow) {

        for (Seat seat : this.seats) {
            if (seat.getType() == seatType && seat.isAtWindow() == atWindow) {
                return seat.getNumber();
            } else {
                return -1;
            }
        }
        return -1;
    }


    /**
     * Tries to book the given seat for a passenger. Throws SeatNotAvailableException if already taken
     *
     * @param seatNumber
     * @param passengerLastName
     * @throws SeatNotAvailableException
     */
    public void bookSeat(int seatNumber, String passengerLastName) {
    for (int i = 0; i < this.seats.size(); i++) {
        if (this.seats.get(i).getNumber() == seatNumber) {
            this.seats.remove(i);
            this.passengerMap.put(seatNumber, passengerLastName);
            return;
        }
    }
    throw new SeatNotAvailableException("Seat already taken or not available.");
}


    public void printPassengerList() {
        System.out.println(this.passengerMap);
    }

}
