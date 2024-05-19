package ru.artem.web6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.artem.web6.model.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

}
