package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/admin")
public class PersonControlller {

    @Autowired
    PersonService personService;
  
    
  //http://localhost:8082/admin/person
    @PostMapping(value="/person")   
    public void addPerson(@RequestBody PersonEntity pe ) {
        personService.addPerson(pe);
    }
}

