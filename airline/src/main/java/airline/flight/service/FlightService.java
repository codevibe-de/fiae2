package airline.flight.service;

import airline.flight.persistence.Flight;
import airline.flight.persistence.FlightRepository;

import java.util.List;

public class FlightService {

    private final FlightRepository repository;

    public FlightService(FlightRepository repository) {
        this.repository = repository;
    }


    public Flight createFlight(String departureAirportCode, String arrivalAirportCode) {
        // todo
        // - generate flight number
        // - create Flight instance
        // - save Flight via repository
        return null;
    }


    public List<Flight> getAllFlights() {
        // todo
        return null;
    }


    public Flight getFlight(String flightNumber) {
        // todo
        return null;
    }


    public void cancelFlight(String flightNumber) {
    }

}
