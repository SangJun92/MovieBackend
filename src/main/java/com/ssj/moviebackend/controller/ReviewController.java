package com.ssj.moviebackend.controller;

import com.ssj.moviebackend.model.Review;
import com.ssj.moviebackend.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/review")
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;


    @PostMapping
    public Review createReview(@RequestBody Review review, @AuthenticationPrincipal UserDetails userDetails) {
        String username = userDetails.getUsername();
        return reviewService.saveReview(review);
    }
}
