package ru.artem.web6.dto;

import lombok.Data;

import java.util.List;
@Data
public class PersonDTO {


    private int id;


    private String name;


    private String surname;


    private String second_name;


    private String tel;


    private String email;

    private String birth;
    private String gender;
    private String bio;
    private String login;
    private String password;

    private List<String> languages;
}