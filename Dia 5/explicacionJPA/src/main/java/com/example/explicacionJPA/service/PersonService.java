package com.example.explicacionJPA.service;

import com.example.explicacionJPA.model.Person;
import com.example.explicacionJPA.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    //Obtener todas las personas
    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }

    //Obetener una persona por ID
    public Optional<Person> getPersonById(Long id){
        return personRepository.findById(id);
    }

    //Guardar una persona
    public Person savePerson(Person person){
        return personRepository.save(person);
    }

    //Eliminar una persona
    public void deletePerson(Long id){
        personRepository.deleteById(id);
    }

    //Actualizar una persona por ID
    public Person updatePerson(Long id,Person personDetails){
        Person person = personRepository.findById(id).orElseThrow();
        person.setName(personDetails.getName());
        person.setAge(personDetails.getAge());
        return personRepository.save(person);
    }
}
