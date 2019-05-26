package com.browner.choreTracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final PersonRepository repository;

    @Autowired
    public DatabaseLoader(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Person("Frodo", "Baggins", "ring bearer"));
    }
}
