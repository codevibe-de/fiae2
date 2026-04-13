package airline.flight.persistence;

import java.util.List;

public interface FlightRepository {

    Flight save(Flight flight);

    List<Flight> findAll();

    Flight findByNumber(String number);

    void deleteAll();

}
