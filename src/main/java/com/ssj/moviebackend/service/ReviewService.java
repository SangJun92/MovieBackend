package com.ssj.moviebackend.service;

import com.ssj.moviebackend.model.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewService {

    Review saveReview(Review review);
    List<Review> findAllReviews(Long movie_id);
    void updateReview(Review review);
    void deleteReview(Long id);
}
