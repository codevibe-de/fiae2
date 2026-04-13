package airline.flight.service;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import airline.flight.persistence.Flight;
import airline.flight.persistence.FlightJsonRepository;
import airline.flight.persistence.FlightRepository;

class FlightServiceTest {

    private FlightRepository flightRepository;

    @BeforeEach
    void setup() {
        flightRepository = new FlightJsonRepository();
        flightRepository.deleteAll();
    }


    @Test
    void getAllFlights() {
        // given
        FlightService service = new FlightService(flightRepository);
        Flight flight = service.createFlight("DUS", "CGN");

        // when
        List<Flight> allFlights = service.getAllFlights();

        // then
        Assertions.assertNotNull(allFlights);
        Assertions.assertEquals(1, allFlights.size());
        Flight firstFlight = allFlights.getFirst();
        Assertions.assertEquals("LH001", firstFlight.getNumber());
        Assertions.assertEquals("DUS", firstFlight.getDepartureAirportCode());
        Assertions.assertEquals("CGN", firstFlight.getArrivalAirportCode());
    }
}