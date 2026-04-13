package App;

import airport.Airport;
import flight.Flight;
import route.Route;

import java.io.File;

public class AirlineMain {
    public static void main(String[] args) {
        AirlineApp app = new AirlineApp();

        app.createFlight(new Flight("ABC","10:30",new Route(new Airport("FRA","Frankfurt","Germany"),new Route(new Airport("FRA","Frankfurt","Germany"));
    }

}
