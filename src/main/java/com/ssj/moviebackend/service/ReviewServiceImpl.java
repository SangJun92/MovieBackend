package com.ssj.moviebackend.service;

import com.ssj.moviebackend.model.Review;
import com.ssj.moviebackend.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    @Override
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public Optional<Review> findReviewById(String username) {
        return reviewRepository.findById(username);
    }
}
