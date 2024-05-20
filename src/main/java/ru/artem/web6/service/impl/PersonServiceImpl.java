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

import java.util.List;
import java.util.Optional;

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
        person.setSurname(personDTO.getSurname());
        person.setSecond_name(personDTO.getSecond_name());
        person.setBirth(personDTO.getBirth());
        person.setBio(personDTO.getBio());
        person.setEmail(personDTO.getEmail());
        person.setGender(personDTO.getGender());
        person.setTel(personDTO.getTel());
        personRepository.save(person);

    }

    @Override
    public Optional<Person> findById(Long id) {
        return personRepository.findById(id);
    }

    @Override
    public void updatePerson(int id, String name, String surname, String second_name, String email) {
         personRepository.updatePerson(id,name,surname,second_name,email);
    }
}
