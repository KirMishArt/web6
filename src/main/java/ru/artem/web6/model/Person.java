package ru.artem.web6.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

//    @NotEmpty(message = "Enter the name. Use A-Z,a-z")
//    @Pattern(regexp = "^[A-Za-z]+$", message = "Use only A-Z,a-z")
    private String name;

//    @NotBlank(message = "Enter the surname. Use A-Z,a-z")
//    @Pattern(regexp = "^[A-Za-z]+$", message = "Use only A-Z,a-z")
    private String surname;

//    @NotBlank(message = "Enter the second name. Use A-Z,a-z")
//    @Pattern(regexp = "^[A-Za-z]+$", message = "Use only A-Z,a-z")
    private String second_name;

//    @Pattern(regexp="^(\\+\\d{1,3})\\s?\\(?(\\d{1,3})\\)?[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,9}$", message="Phone number cannot contain letters. Enter the +,-,(),0-9")
    private String tel;

//    @NotBlank(message = "Email should be valid ")
//    @Email(message = "Email should be valid ")
    private String email;

    private String birth;
    private String gender;
    private String bio;
    private String login;
    private String password;

    @ManyToMany
    @JoinTable(
            name = "person_languages",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "language_id")
    )
    private List<Language> languages;
}
