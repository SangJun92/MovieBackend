package com.ssj.moviebackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "movie_id")
    private Long movie_id;

    @Column(name = "username", unique = true,  length = 100)
    private String username;

    @Column(name = "content")
    private String content;

    @Column(name = "vot_avg")
    private Double vot_avg;

    @Transient
    private String token;
}
