package airline.flight.persistence;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FlightJsonRepository {

    private final ObjectMapper mapper;

    public FlightJsonRepository() {
        mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public void saveFlights(String directory, String filename, List<Flight> flights) throws IOException {
        File output = new File(directory, filename);
        output.getParentFile().mkdirs();
        mapper.writeValue(output, flights);
        System.out.println("Flights saved to: " + output.getAbsolutePath());
    }

    public List<Flight> loadFlights(String directory, String filename) throws IOException {
        File file = new File(directory, filename);
        return mapper.readValue(
                file,
                mapper.getTypeFactory().constructCollectionType(List.class, Flight.class)
        );
    }

}



