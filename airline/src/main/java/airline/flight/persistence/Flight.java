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

    public void addSeats(int startNumber, int count, SeatType type) {
        boolean atWindow = false;
        for(int i = startNumber; i <= count; i++) {
            if (i % 6 == 0){
                atWindow = true;
            }
            else {
                atWindow = false;
            }
            Seat seat = new Seat(i, atWindow, type);
            this.seats.add(seat);
        }
    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    public String getArrivalAirportCode() {
        return arrivalAirportCode;
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
