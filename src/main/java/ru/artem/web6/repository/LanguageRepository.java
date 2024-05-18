package ru.artem.web6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.artem.web6.model.Language;

public interface LanguageRepository extends JpaRepository<Language,Long> {
}
