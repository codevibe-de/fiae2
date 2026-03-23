package de.codevibe.patterns.scheduler;

import java.time.LocalDateTime;

public class SchedulerApp {

    public static void main(String[] args) {

        JobScheduler scheduler = new JobScheduler();
        scheduler.scheduleJob(
                LocalDateTime.now().plusHours(1),
                new MyCleanupJob()
        );

    }

}

class MyCleanupJob implements Runnable {

    @Override
    public void run() {
        // löscht irgendwas
    }
}

