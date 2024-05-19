package ru.artem.web6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.artem.web6.model.Language;

import java.util.List;
@Repository
public interface LanguageRepository extends JpaRepository<Language,Long> {
    public List<Language> findAllByNameIn(List<String>names);
}
