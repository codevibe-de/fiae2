package de.codevibe.patterns.observer;

import java.util.List;

public abstract class Publisher {

    private List<Subscriber> subscribers;


    public void addSubscriber(Subscriber subscriber) {
        if (!this.subscribers.contains(subscriber)) {
            this.subscribers.add(subscriber);
        }
    }


    public void notifySubscribers(String details) {
        for (Subscriber s : this.subscribers) {
            s.updated(details);
        }
    }

}
