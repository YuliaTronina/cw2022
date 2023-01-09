package ru.student.cw2022.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "FILMS")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id")
    private long id;

    @Column (name = "title", nullable = false)
    private String title;

    @Column(name = "genre", nullable = false)
    private String genre;

    @Column(name = "producer", nullable = false)
    private String producer;

    @Column(name = "filmDate", nullable = false)
    private String filmDate;

    @Column(name = "filmBudget")
    private String filmBudget;
}
