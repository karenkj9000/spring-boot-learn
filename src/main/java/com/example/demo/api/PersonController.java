package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PersonController {

    private final PersonService personService;

    @Autowired
    PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
