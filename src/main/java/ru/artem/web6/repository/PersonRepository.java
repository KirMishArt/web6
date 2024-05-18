package ru.artem.web6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.artem.web6.model.Person;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
