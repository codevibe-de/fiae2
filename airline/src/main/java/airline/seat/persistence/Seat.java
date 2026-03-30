package airline.seat.persistence;

public class Seat {
    private int number;
    private boolean atWindow;
    private SeatType type;
    private boolean booked;
    private String passangerLastName;

    public Seat(int number, boolean atWindow, SeatType type) {
        this.number = number;
        this.atWindow = atWindow;
        this.type = type;
        this.booked = false;
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

    public boolean isBocked(){
        return booked;
    }

    public String getPassangerLastName() {
        return passangerLastName;
    }

    public void book(String lastName){
        this.booked = true;
        this.passangerLastName = lastName;
    }
}
