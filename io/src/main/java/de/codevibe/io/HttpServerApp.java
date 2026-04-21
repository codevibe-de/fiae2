package de.codevibe.io;

import airline.flight.persistence.Flight;
import airline.flight.persistence.FlightJsonRepository;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class HttpServerApp {

    public static void main(String[] args) throws IOException {
        InetSocketAddress socketAddress = new InetSocketAddress(8080);
        HttpServer httpServer = HttpServer.create(socketAddress, 0);
        httpServer.createContext("/api/flights", new FlightsHttpHandler());
        httpServer.start();
        System.out.println("Server waiting for requests on " + socketAddress);
    }


    static class FlightsHttpHandler implements HttpHandler {
        private final ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            System.out.println(exchange.getRequestMethod());
            // flüge laden
            FlightJsonRepository repo = new FlightJsonRepository();
            List<Flight> flights = repo.loadFlights("C:\\Data\\Flights", "flights.json");
            // json erzeugen
            String json = mapper.writeValueAsString(flights);
            byte[] bytes = json.getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().add("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, bytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(bytes);
            }
        }

    }
}