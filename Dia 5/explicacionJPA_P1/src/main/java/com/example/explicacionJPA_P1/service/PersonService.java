package com.example.explicacionJPA_P1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.explicacionJPA_P1.model.Person;
import com.example.explicacionJPA_P1.repository.personRepository;

@Service
public class PersonService {

    @Autowired
    private personRepository personRepository;

    // Obtener todas las personas
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    // Obtener una persona por id
    public Optional<Person> getPersonById(Long id){
        return personRepository.findById(id);
    }

    // Guardar una persona
    public Person savePerson(Person person){
        return personRepository.save(person);
    }

    // Eliminar persona
    public void deletePerson(Long id){
        personRepository.deleteById(id);
    }

    // Actualizar persona
    public Person updatePerson(Long id, Person personDetails){
        Person person = personRepository.findById(id).orElseThrow();
        person.setName(personDetails.getName());
        person.setAge(personDetails.getAge());
        return personRepository.save(person);
    }

}
