package airline.flight.service;

import airline.flight.persistence.Flight;
import airline.flight.persistence.FlightJsonRepository;

import java.util.List;

public class FlightService {

    private final FlightJsonRepository repository;

    public FlightService(FlightJsonRepository repository) {
        this.repository = repository;
    }


    // - Eingaben prüfen
    // - Flight speichern
    public void addFlight(Flight flight) {
        // 1. Gibt es diesen Flug schon? => Fehler!
        // 2. Flug speichern
    }


    public List<Flight> getAllFlights() {
        return null;
    }


    public void cancelFlight(Flight flight) {
    }

}
