package airline.flight.persistence;

import java.io.File;
import java.util.List;

import airline.io.JSONReader;
import airline.io.JSONWriter;

public class FlightJsonRepository implements FlightRepository {

    File fileName = new File("flights.json");
    File directoryPath = new File("C:\\Data\\Airline\\JSONs");

    @Override
    public Flight save(Flight flight) {
        List<Flight> flightList = JSONReader.reader(directoryPath, fileName);

        flightList.add(flight);

        JSONWriter.saveObjectToJSON(directoryPath, fileName, flightList, false, true);
        return null;
    }

    @Override
    public Flight save(List<Flight> flightList) {
        JSONWriter.saveObjectToJSON(directoryPath, fileName, flightList, false, true);
        return null;
    }

    @Override
    public List<Flight> findAll() {
        List<Flight> flightList = JSONReader.reader(directoryPath, fileName);
        return flightList;
    }

    @Override
    public Flight findByNumber(String number) {
        
        List<Flight> flightList = findAll();

        for (Flight flight : flightList) {
            if (flight.getNumber().equals(number)) {
                return flight;
            }
        }

        return null;
    }

    @Override
    public void deleteAll() {
        JSONWriter.deleteJSONContent(directoryPath, fileName);
    }

}
