package ru.artem.web6.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class LanguageDTO {
    private Long id;
    private String name;
}
