package App;

import Passanger.Passanger;
import flight.Flight;
import seat.Seat;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AirlineApp {
    File airportFile;
    File routeFile;
    File flightFile = new File("flights.json");
    File bookingFile;





    public void createFlight(Flight flight) {
        ObjectMapper mapper = new ObjectMapper();
        List<Flight> flights = mapper.readValue(flightFile, new TypeReference<List<Flight>>() {});
        flights.add(flight);
        mapper.writeValue(flightFile, flights);
    }
    public boolean searchFlight(String flight) {
        ObjectMapper mapper = new ObjectMapper();

        ArrayList<Flight> flightList = mapper.readValue(flightFile, new TypeReference<ArrayList<Flight>>() {});
        for (Flight f:flightList){
            if(Objects.equals(flight, f.getName())){
                return true;
            }
        }
        return false;
    }


}
