package com.browner.choreTracker;

import com.browner.choreTracker.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {


}