package seat;

public class Seat {
    private SeatType seatType;
    private String seatNumber;
    private Boolean isWindow;
    private Boolean isBooked;

    public Seat(SeatType seatType, String seatNumber) {
        this.seatType = seatType;
        this.seatNumber = seatNumber;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public Boolean getWindow() {
        return isWindow;
    }

    public Boolean getBooked() {
        return isBooked;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setWindow(Boolean window) {
        isWindow = window;
    }

    public void setBooked(Boolean booked) {
        isBooked = booked;
    }
}
