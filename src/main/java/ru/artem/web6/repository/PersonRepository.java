package ru.artem.web6.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.artem.web6.model.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    @Modifying
    @Transactional
    @Query("UPDATE Person p SET p.name = :name, p.surname = :surname, p.second_name = :second_name, p.email = :email WHERE p.id = :id")
    void updatePerson(@Param("id") int id, @Param("name") String name, @Param("surname") String surname, @Param("second_name") String second_name, @Param("email") String email);

}
