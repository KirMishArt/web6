package ru.artem.web6.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.artem.web6.dto.PersonDTO;
import ru.artem.web6.model.Person;
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
        return "people";
    }
    @GetMapping("/new")
    public String newPerson(@ModelAttribute("person") PersonDTO personDTO){
        return "form";
    }
    @PostMapping()
    public String save(@ModelAttribute("person") @Valid PersonDTO personDTO,
                       BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()) {
            return "form";
        }
        personService.save(personDTO);
        return "redirect:/people";
    }
    @GetMapping("/login")
    public String login() {
        return "login"; // Эта страница будет отображать форму входа
    }

    @GetMapping("/403")
    public String accessDenied() {
        return "403"; // Эта страница будет отображать ошибку доступа
    }
    @GetMapping("/authentication")
    public String authentication(){return "authentication";}
}
