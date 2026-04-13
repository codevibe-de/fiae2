package de.codevibe.io;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class HttpServerApp {

    public static void main(String[] args) throws IOException {
        InetSocketAddress socketAddress = new InetSocketAddress(8080);
        HttpServer httpServer = HttpServer.create(socketAddress, 0);
        httpServer.createContext("/api/flights", new FlightsHttpHandler());
        httpServer.start();
        System.out.println("Server waiting for requests on " + socketAddress);
    }


    static class FlightsHttpHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            System.out.println(exchange.getRequestMethod());
            // prep body
            String responseBody = "Hi😁";
            byte[] responseBodyBytes = responseBody.getBytes(StandardCharsets.UTF_8);
            // write body
            exchange.getResponseHeaders().add("Content-Type", "text/plain");
            exchange.sendResponseHeaders(200, responseBodyBytes.length);
            OutputStream responseBodyOut = exchange.getResponseBody();
            responseBodyOut.write(responseBodyBytes);
            responseBodyOut.close();
        }
    }

}
