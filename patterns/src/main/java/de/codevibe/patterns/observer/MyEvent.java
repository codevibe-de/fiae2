package de.codevibe.patterns.observer;

public class MyEvent {

    private final String payload;

    public MyEvent(String payload) {
        this.payload = payload;
    }

    public String getPayload() {
        return payload;
    }

}
