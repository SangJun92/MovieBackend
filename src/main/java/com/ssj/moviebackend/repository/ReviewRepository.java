package com.ssj.moviebackend.repository;

import com.ssj.moviebackend.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    @Query("SELECT r FROM Review r WHERE r.movie_id = ?1")
    List<Review> findByMovieId(Review review);

}
