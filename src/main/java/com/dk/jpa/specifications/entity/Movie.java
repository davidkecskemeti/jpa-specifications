package com.dk.jpa.specifications.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String genre;
    private double rating;
    private double watchTime;
    private int releaseYear;

    public Movie(String title, String genre, double rating, double watchTime, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.watchTime = watchTime;
        this.releaseYear = releaseYear;
    }

}
