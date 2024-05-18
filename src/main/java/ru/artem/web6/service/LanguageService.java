package ru.artem.web6.service;

import org.springframework.stereotype.Service;
import ru.artem.web6.model.Language;
import ru.artem.web6.model.Person;

import java.util.List;

@Service
public interface LanguageService {
    List<Language> AllLanguages();
}
