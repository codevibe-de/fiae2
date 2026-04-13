package Booking;

import Passanger.Passanger;
import flight.Flight;
import seat.Seat;

public class Booking {
    private final String id;
    private Seat seat;
    private Flight flight;

    public Booking(String id, Seat seat, Flight flight) {
        this.id = id;
        this.seat = seat;
        this.flight = flight;
    }

    public String getId() {
        return id;
    }

    public Seat getSeat() {
        return seat;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

//    public Passanger getPassanger() {
//        return flight.getPassangerList().get(getSeat());
//    }
}
