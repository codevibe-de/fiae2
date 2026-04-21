package airline.flight.persistence;

import java.util.ArrayList;
import java.util.List;

import airline.booking.service.SeatNotAvailableException;

public class Flight {

    private String number;
    private String departureAirportCode;
    private String arrivalAirportCode;
    private List<Seat> seats;

    public Flight(String number, String departureAirportCode, String arrivalAirportCode) {
        this.number = number;
        this.departureAirportCode = departureAirportCode;
        this.arrivalAirportCode = arrivalAirportCode;
        this.seats = new ArrayList<>();
    }

    public Flight() {
        
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

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDepartureAirportCode(String departureAirportCode) {
        this.departureAirportCode = departureAirportCode;
    }

    public void setArrivalAirportCode(String arrivalAirportCode) {
        this.arrivalAirportCode = arrivalAirportCode;
    }

    /**
     * Adds a number of seats to this flight. Every 6th seat will be marked as a window seat.
     *
     * @param startNumber
     * @param count
     * @param type
     */
    void addSeats(int startNumber, int count, SeatType type) {
        for (int i = 0; i <= count; i++) {
            if (i % 6 == 0) {
                this.seats.add(new Seat(startNumber + i, true, type));
            } else {
                this.seats.add(new Seat(startNumber + i, false, type));
            }
        }
    }


    /**
     * Returns an unmodifiable list of all seats for this flight.
     */
    public List<Seat> getSeats() {
        return this.seats;
    }


    /**
     * Returns a list of all seats matching the given criteria, which might be an empty list.
     *
     * @param seatType
     * @param atWindow
     */
    public int getAvailableSeatNumber(SeatType seatType, Boolean atWindow) {
        for (Seat seat : this.seats) {
            if (seat.getType() == seatType && seat.isAtWindow() == atWindow) {
                return seat.getNumber();
            } else {
                throw new SeatNotAvailableException("Seat not found.");
            }
        }
        return -1;
    }

}
