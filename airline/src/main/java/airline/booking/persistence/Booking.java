package airline.booking.persistence;

public class Booking {
    private final String flightNumber;
    private final int seatNumber;
    private final String passengerLastName;

    public Booking(String flightNumber, int seatNumber, String passengerLastName) {
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.passengerLastName = passengerLastName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
    public int getSeatNumber() {
        return seatNumber;
    }
    public String getPassengerLastName() {
        return passengerLastName;
    }
}
