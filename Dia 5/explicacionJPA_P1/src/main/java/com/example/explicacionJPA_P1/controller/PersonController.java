package com.example.explicacionJPA_P1.controller;

import com.example.explicacionJPA_P1.service.PersonService;
import com.example.explicacionJPA_P1.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
@CrossOrigin(origins= "http://127.0.0.1:5500/")
public class PersonController{

    @Autowired
    private PersonService personService;

    // Obtener todas las personas con verbo GET
    @GetMapping
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }

    // Obtener una persona por Id con verbo GET
    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id){
        return personService.getPersonById(id).orElseThrow();
    }

    // Crear una persona
    // localhost:8080/api/persons con verbo POST
    // {
    //      "name":"Andres",
    //      "age":25
    // }
    @PostMapping
    public Person createPerson(@RequestBody Person person){
        return personService.savePerson(person);
    }

    // Actualizar una persona
    // localhost:8080/api/persons con verbo PUT
    // {
    //      "name":"Andres",
    //      "age":25
    // }
    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable Long id, @RequestBody Person person){
        return personService.updatePerson(id, person);
    }

    // Eliminar una persona
    // localhost:8080/api/persons con verbo DELETE
    // {
    //      "name":"Andres",
    //      "age":25
    // }
    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id){
        personService.deletePerson(id);
    }
}
