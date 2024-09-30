package com.example.explicacionJPA_P1.repository;

import com.example.explicacionJPA_P1.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface personRepository extends JpaRepository<Person, Long> {
}
