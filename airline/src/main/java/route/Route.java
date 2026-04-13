package route;

import airport.Airport;

import java.sql.Time;
import java.time.Duration;

public class Route {
    private final Airport startAirport;
    private final Airport endAirport;
    private Duration routeDuration;

    public Route(Airport startAirport, Airport endAirport) {
        this.startAirport = startAirport;
        this.endAirport = endAirport;
    }

    public void setRouteDuration(Duration routeDuration) {
        this.routeDuration = routeDuration;
    }
    public Duration getRouteDuration() {
        return routeDuration;
    }

}
