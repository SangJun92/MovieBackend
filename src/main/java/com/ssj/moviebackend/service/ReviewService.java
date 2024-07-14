package com.ssj.moviebackend.service;

import com.ssj.moviebackend.model.Review;

import java.util.Optional;

public interface ReviewService {

    Review saveReview(Review review);
    Optional<Review> findReviewById(String username);
}
