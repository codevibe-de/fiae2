package airline.flight.service;

import java.util.List;

import airline.flight.persistence.Flight;
import airline.flight.persistence.FlightRepository;

public class FlightService {

    private final FlightRepository repository;

    public FlightService(FlightRepository repository) {
        this.repository = repository;
    }


    public Flight createFlight(String departureAirportCode, String arrivalAirportCode) {

        String flightNumber = String.valueOf(getAllFlights().size() + 1);

        Flight flight = new Flight(flightNumber, departureAirportCode, arrivalAirportCode);

        repository.save(flight);


        // todo
        // - generate flight number
        // - create Flight instance
        // - save Flight via repository
        return null;
    }


    public List<Flight> getAllFlights() {

        List<Flight> flightList = repository.findAll();
        return flightList;
    }


    public Flight getFlight(String flightNumber) {
        // todo
        return null;
    }


    public void cancelFlight(String flightNumber) {
    }

}
