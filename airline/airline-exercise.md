## Einstieg

### FlightServiceTest

Startet mit der Klasse `FlightServiceTest` und implementiere die Service-Methoden so, dass die Tests grün werden.

Das erfordert allerdings auch eine erste Implementierung des `FlightRepository` z.B. über das
bereits vorhandene `FlightJsonRepository`. Du kannst alternativ auch eine einfachere Variante als
neue Implementierung des `FlightRepository` erstellen, z.B. `FlightInMemoryRepository`,
das die Daten einfach in einer Liste hält.

### BookingServiceTest

Schreibe nun einen Test, der die Buchung eines Platzes testet -- und implementiere dann die
notwendigen Methoden im `BookingService` damit der Test grün wird.

Dazu braucht es auch wiederum eine `BookingRepository` Instanz, gleiche Spiel wie oben.

## Fortgeschrittene Features

### Weitere Entitäten

Erweitere das System um zusätzliche Entitäten wie:

- Route
- Airport
- Plane

### Tabellarische Ausgabe

Daten der Anwendung (z. B. gebuchte Sitze pro Flug) können als hübsche ASCII Tabellen zur Visualisierung
des Systemzustands ausgegeben werden.

### HttpServer

Beginne die Arbeit an der API des Systems, wie z.B.

- Erzeugung eines Flugs über einen `POST /flights` Endpoint
- Buchung eines Sitzes über einen `POST /bookings` Endpoint
- Abfrage aller Flüge über einen `GET /flights` Endpoint

### HttpClient

Schreibe einen Client, der die API eines anderen Rechners nutzt, um z.B. alle Flüge zu laden.

Und dann sogar, um eine konkrete Buchung zu machen. D.h., der Server eines anderen spielt Airline-Server und stellt
Daten und Dienste zur Verfügung. Dein Rechner nutzt diesen als "Reisebüro-Client", indem über eine einfache Oberfläche (
Terminal oder Swing) diese Daten angezeigt und Dienste genutzt werden (jeweils über HTTP Aufrufe).