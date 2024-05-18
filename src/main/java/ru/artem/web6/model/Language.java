package ru.artem.web6.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "language_seq")
    @SequenceGenerator(name = "language_seq", sequenceName = "languages_id_seq", allocationSize = 1)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;
}
