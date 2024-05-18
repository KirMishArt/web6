package ru.artem.web6.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.artem.web6.model.Person;
import ru.artem.web6.repository.PersonRepository;
import ru.artem.web6.service.PersonService;

import java.util.List;
@Service
@AllArgsConstructor
@Primary
public class PersonServiceImpl implements PersonService {
    private final PersonRepository repository;
    @Override
    public List<Person> AllPersons() {
        return repository.findAll();
    }
}
