package airline.flight.persistence;

import java.io.File;
import java.util.List;

import airline.io.JSONReader;
import airline.io.JSONWriter;

public class FlightJsonRepository implements FlightRepository {

    @Override
    public Flight save(Flight flight) {
        File fileName = new File("flights.json");
        File directoryPath = new File("C:\\Data\\Airline\\JSONs");
        JSONWriter.writer(directoryPath, fileName, flight, false);
        return null;
    }

    @Override
    public List<Flight> findAll() {
        File fileName = new File("flights.json");
        File directoryPath = new File("C:\\Data\\Airline\\JSONs");
        List<Flight> flightList = JSONReader.reader(directoryPath, fileName);
        // todo
        return flightList;
    }

    @Override
    public Flight findByNumber(String number) {
        // todo
        return null;
    }

    @Override
    public void deleteAll() {
        // todo
    }

}
