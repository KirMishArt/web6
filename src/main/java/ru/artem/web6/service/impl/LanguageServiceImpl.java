package ru.artem.web6.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.artem.web6.model.Language;
import ru.artem.web6.repository.LanguageRepository;
import ru.artem.web6.repository.PersonRepository;
import ru.artem.web6.service.LanguageService;
import ru.artem.web6.service.PersonService;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class LanguageServiceImpl implements LanguageService {
    private final LanguageRepository repository;
    @Override
    public List<Language> AllLanguages() {
        return repository.findAll();
    }
}
