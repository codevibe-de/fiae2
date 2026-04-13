package flight;

import Passanger.Passanger;
import route.Route;
import seat.Seat;

import java.sql.Time;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

public class Flight {
    private final String name;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
//    private Map<Seat, Passanger> passangerList;
    private Route route;

    public Flight(String name, LocalTime departureTime,Route route) {
        this.name = name;
        this.departureTime = departureTime;
        this.route = route;
        setArrivalTime();
    }

    public String getName() {
        return name;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalTime getArrivalTime() {
       return arrivalTime;
    }

//    public Map<Seat, Passanger> getPassangerList() {
//        return passangerList;
//    }

    public Route getRoute() {
        return route;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public void setArrivalTime() {
        this.arrivalTime = departureTime.plus(route.getRouteDuration());
    }

}
