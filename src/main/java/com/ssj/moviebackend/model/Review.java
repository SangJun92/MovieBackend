package com.ssj.moviebackend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "movie_id", nullable = false)
    private Long movie_id;

    @Column(name = "username", unique = true, nullable = false, length = 100)
    private String username;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "vot_avg", nullable = false)
    private Double vot_avg;

    @Transient
    private String token;
}
