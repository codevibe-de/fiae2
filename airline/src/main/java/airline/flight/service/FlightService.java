package airline.flight.service;
import airline.flight.persistence.Flight;
import airline.flight.persistence.FlightNotAvailableException;

import java.util.ArrayList;
import java.util.List;

public class FlightService {

    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        for (Flight f : flights) {
            if (f.getNumber().equals(flight.getNumber())) {
                throw new IllegalArgumentException("Flight already exists: " + flight.getNumber());
            }
        }
        flights.add(flight);
    }

    public List<Flight> getAllFlights() {
        return new ArrayList<>(flights); // defensive copy
    }

    public void cancelFlight(String flightNumber) {
        Flight toRemove = null;
        for (Flight f : flights) {
            if (f.getNumber().equals(flightNumber)) {
                toRemove = f;
                break;
            }
        }
        if (toRemove == null) {
            throw new FlightNotAvailableException("Flight not found: " + flightNumber);
        }
        flights.remove(toRemove);
    }

}
