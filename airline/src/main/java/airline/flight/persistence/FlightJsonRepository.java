package airline.flight.persistence;

import java.io.File;
import java.util.List;

import airline.io.JSONReader;
import airline.io.JSONWriter;

public class FlightJsonRepository {

    static final File repoPath = new File("C:\\Data\\Airline\\JSONs");
    static final File fileName = new File("flights.json");

    // save(Flight)
    public static boolean save(Flight flight) {
        return JSONWriter.writer(repoPath, fileName, flight, true);
    }

    // findAll() -> List<Flight>
    public static List<Flight> findAll() {
        return JSONReader.reader(repoPath, fileName);
    }


    // findByNumber(String number)
    // deleteAll()

}
