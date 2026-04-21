package airline.flight.service;

import airline.flight.persistence.Flight;
import airline.flight.persistence.FlightJsonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FlightServiceTest {

    @Test
    void getAllFlights() {
        // given
        FlightJsonRepository repository = new FlightJsonRepository();
        FlightService service = new FlightService();
        Flight flight = new Flight("LH001", "Düsseldorf", "Köln");

        // when
        service.addFlight(flight);
        List<Flight> allFlights = service.getAllFlights();

        // then
       // Assertions.assertNotNull(allFlights);
       // Assertions.assertEquals(1, allFlights.size());
       // Flight firstFlight = allFlights.getFirst();
       // Assertions.assertEquals("LH001", firstFlight.);
    }
}