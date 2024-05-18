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
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_seq")
    @SequenceGenerator(name = "person_seq", sequenceName = "persons_id_seq", allocationSize = 1)
    private Long id;

    @NotEmpty(message = "Enter the name. Use A-Z,a-z")
    @Pattern(regexp = "^[A-Za-z]+$", message = "Use only A-Z,a-z")
    @Column(nullable = false)
    private String name;

    @NotBlank(message = "Enter the surname. Use A-Z,a-z")
    @Pattern(regexp = "^[A-Za-z]+$", message = "Use only A-Z,a-z")
    @Column(nullable = false)
    private String surname;

    @NotBlank(message = "Enter the second name. Use A-Z,a-z")
    @Pattern(regexp = "^[A-Za-z]+$", message = "Use only A-Z,a-z")
    @Column(nullable = false)
    private String second_name;

    @Pattern(regexp = "^(\\+\\d{1,3})\\s?\\(?(\\d{1,3})\\)?[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,9}$", message = "Phone number cannot contain letters. Enter the +,-,(),0-9")
    private String tel;

    @NotBlank(message = "Email should be valid")
    @Email(message = "Email should be valid")
    @Column(nullable = false, unique = true)
    private String email;

    @NotBlank(message = "Birth date should be valid")
    @Column(nullable = false, unique = true)
    private String birth;

    private String gender;

    @Column(length = 1000)
    private String bio;

    @NotBlank(message = "Login should be valid")
    @Column(nullable = false, unique = true)
    private String login;

    @NotBlank(message = "Password should be valid")
    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Language> languages;
}
