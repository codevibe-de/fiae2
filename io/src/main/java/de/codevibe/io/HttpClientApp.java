package de.codevibe.io;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientApp {


    public static void main(String[] args) throws Exception {
        // 1. Client erstellen
        HttpClient client = HttpClient.newHttpClient();
        // 2. Request bauen
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/api/flights"))
                .GET()
                .build();
        // 3. Request senden
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());
        // 4. Antwort ausgeben
        System.out.println("Status: " + response.statusCode());
        System.out.println("Body: " + response.body());

    }

}
