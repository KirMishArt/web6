package ru.artem.web6.service;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import ru.artem.web6.dto.PersonDTO;
import ru.artem.web6.model.Person;

import java.util.List;
import java.util.Optional;

@Service
public interface PersonService {
    List<Person> AllPersons();


    void save(PersonDTO personDTO);
    Optional<Person> findById(Long id);
    void updatePerson( int id,  String name,  String surname,  String second_name,  String email);
}
