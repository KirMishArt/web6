package ru.artem.web6.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.artem.web6.repository.LanguageRepository;
import ru.artem.web6.service.LanguageService;
import ru.artem.web6.service.PersonService;

@Controller
@RequestMapping("/people")
@AllArgsConstructor
public class PersonController {
    private final PersonService personService;
    private final LanguageService languageService;
    @GetMapping()
    public String index(Model model){
        model.addAttribute("people",personService.AllPersons());
        model.addAttribute("languages",languageService.AllLanguages());
        return "people";
    }
}
