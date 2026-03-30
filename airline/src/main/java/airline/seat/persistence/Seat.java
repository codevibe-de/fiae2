package airline.seat.persistence;

public class Seat {
    private int number;
    private boolean atWindow;
    private SeatType type;

    public Seat(int number, boolean atWindow, SeatType type) {
        this.number = number;
        this.atWindow = atWindow;
        this.type = type;
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
}
