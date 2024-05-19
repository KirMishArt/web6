package ru.artem.web6.service;

import org.springframework.stereotype.Service;
import ru.artem.web6.dto.PersonDTO;
import ru.artem.web6.model.Person;

import java.util.List;

@Service
public interface PersonService {
    List<Person> AllPersons();


    void save(PersonDTO personDTO);
}
