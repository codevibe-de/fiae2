package airline.flight.persistence;

public class Seat {
    private int number;
    private boolean atWindow;
    private SeatType type;
    private boolean reserved;
    private String passengerName;

    public Seat(int number, boolean atWindow, SeatType type) {
        this.number = number;
        this.atWindow = atWindow;
        this.type = type;
        this.reserved = false;
    }
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
        this.passengerName = passengerName;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public boolean isAtWindow() {
        return atWindow;
    }
    public void setAtWindow(boolean atWindow) {
        this.atWindow = atWindow;
    }
    public SeatType getType() {
        return type;
    }
    public void setType(SeatType type) {
        this.type = type;
    }
    public boolean isReserved() {
        return reserved;
    }
    public String getPassengerName() {
        return passengerName;
    }
    public void reserve(String passengerName) {
        this.reserved = true;
        this.passengerName = passengerName;
    }
}
