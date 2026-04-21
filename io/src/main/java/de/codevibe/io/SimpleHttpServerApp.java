package de.codevibe.io;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class SimpleHttpServerApp {

    public static void main(String[] args) throws IOException {
        System.out.println("Starting HTTP server");

        HttpServer httpServer = HttpServer.create(new InetSocketAddress(443), 0);
        httpServer.createContext("/greeting", new GreetingHandler());
        httpServer.start();

        System.out.println("Server listing on " + httpServer.getAddress());
    }


    static class GreetingHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            System.out.println("Handling a greeting request with method " + exchange.getRequestMethod());

            // prepare body
            String bodyStr = "Hi du!";
            byte[] bytes = bodyStr.getBytes(StandardCharsets.UTF_8);
            // add to response
            exchange.getResponseHeaders().add("Content-Type", "text/plain");
            exchange.sendResponseHeaders(200, bytes.length);
            OutputStream responseBodyOut = exchange.getResponseBody();
            responseBodyOut.write(bytes);
            responseBodyOut.close();
        }
    }


    static class GetFlightsHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // 1. Flüge vom FlightService besorgen
            // 2. Flüge in JSON konvertieren
            // 3. Body + Headers in die Response (via HttpExchange) schreiben
        }
    }

}
