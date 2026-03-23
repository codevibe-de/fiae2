package de.codevibe.patterns.scheduler;

import java.time.LocalDateTime;

public class JobScheduler {

    public void scheduleJob(LocalDateTime dateTime, Runnable runnable) {
        // merkt sich jetzt, wann was gemacht werden soll
        runnable.run();
    }

}
