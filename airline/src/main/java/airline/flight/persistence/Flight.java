package airline.flight.persistence;

import airline.flight.service.SeatNotAvailableException;
import java.util.ArrayList;
import java.util.List;

public class Flight {

    private  String number;
    private String departsFrom;
    private  String arrivesAt;
    private  List<Seat> seats;

    public Flight(String number, String departsFrom, String arrivesAt) {
        this.number = number;
        this.departsFrom = departsFrom;
        this.arrivesAt = arrivesAt;
        this.seats = new ArrayList<>();
    }

    public Flight(String number, String departsFrom, String arrivesAt, List<Seat> seats) {
        this.number = number;
        this.departsFrom = departsFrom;
        this.arrivesAt = arrivesAt;
        this.seats = seats;
    }

    public Flight() {
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
        for (int i = 0; i < count; i++) {
            int seatNumber = startNumber + i;
            boolean isWindow = (seatNumber % 6 == 0);
            Seat seat = new Seat(seatNumber, isWindow, type);
            seats.add(seat);
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
        for (Seat seat : seats) {
            if (seat.getType() != seatType) {
                continue;
            }
            if (atWindow != null && seat.isAtWindow() != atWindow) {
                continue;
            }
            if (seat.isReserved()) {
                continue;
            }
            return seat.getNumber();
        }
        throw new SeatNotAvailableException("No seat available or all Seats are reserved");
    }

    public void bookSeat(int seatNumber, String passengerName) {
        for (Seat seat : seats) {
            if (seat.getNumber() == seatNumber) {
                if (seat.isReserved()) {
                    throw new RuntimeException("Seat already reserved");
                }
                seat.reserve(passengerName);
                return;
            }
        }
        throw new RuntimeException("Seat not found");
    }

    public void printPassengerList() {
        System.out.println("Passenger list for flight " + number + ":");
        for (Seat seat : seats) {
            if (seat.isReserved()) {
                System.out.println("Seat " + seat.getNumber() + ": " + seat.getPassengerName());
            }
        }
    }

    public String getDepartsFrom() {
        return departsFrom;
    }
    public String getArrivesAt() {
        return arrivesAt;
    }
    public List<Seat> getSeats() {
        return seats;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDepartsFrom(String departsFrom) {
        this.departsFrom = departsFrom;
    }

    public void setArrivesAt(String arrivesAt) {
        this.arrivesAt = arrivesAt;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
