package ru.artem.web6.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.artem.web6.dto.PersonDTO;
import ru.artem.web6.model.Language;
import ru.artem.web6.model.Person;
import ru.artem.web6.repository.PersonRepository;
import ru.artem.web6.service.LanguageService;
import ru.artem.web6.service.PersonService;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
@Primary
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;
    private final LanguageService languageService;
    @Override
    public List<Person> AllPersons() {
        return personRepository.findAll();
    }
    @Override
    public void save(PersonDTO personDTO){
        List<Language> languages= languageService.getAllByNames(personDTO.getLanguages());
        Person person=new Person();
        person.setLanguages(languages);
        person.setName(personDTO.getName());
        person.setSurname(person.getSurname());
        personRepository.save(person);

    }
}
