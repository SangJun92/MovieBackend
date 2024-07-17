package com.ssj.moviebackend.service;

import com.ssj.moviebackend.model.Review;
import com.ssj.moviebackend.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public List<Review> findAllReviews(Long movie_id) {
        return reviewRepository.findByMovieId(movie_id);
    }


    @Override
    public void updateReview(Review review) {
        reviewRepository.save(review);

    }

    @Override
    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);

    }
}
