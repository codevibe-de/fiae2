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
        String flightNumberStart = "LH000";
        flightNumberStart = flightNumberStart.substring(0, 5 - flightNumber.length());
        String completeNumber = flightNumberStart + flightNumber;

        Flight flight = new Flight(completeNumber, departureAirportCode, arrivalAirportCode);

        repository.save(flight);
        return flight;
    }


    public List<Flight> getAllFlights() {

        List<Flight> flightList = repository.findAll();
        System.out.println(flightList);
        return flightList;

    }


    public Flight getFlight(String flightNumber) {

        Flight flight = repository.findByNumber(flightNumber);

        if (flight != null) {
            return flight;
        }
        
        return null;
    }


    public void cancelFlight(String flightNumber) {

        List<Flight> flightList = repository.findAll();

        flightList.removeIf(flight -> flight.getNumber().equals(flightNumber));

        repository.save(flightList);
    }

}
