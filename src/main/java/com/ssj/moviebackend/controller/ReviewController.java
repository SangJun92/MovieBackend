package com.ssj.moviebackend.controller;

import com.ssj.moviebackend.model.Review;
import com.ssj.moviebackend.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/review")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

//    @GetMapping("/inputReview/{id}")
//    private String reviewList(@AuthenticationPrincipal UserDetails userDetails) {
//        return "/api/review/inputReview";
//    }

    @GetMapping("/getReview/{movie_id}")
    public ResponseEntity<List<Review>> reviewList(@PathVariable Long movie_id) {
        // 리뷰 데이터를 가져오는 로직 구현
        System.out.println("확인ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ");
        List<Review> reviews = reviewService.findAllReviews(movie_id);
        System.out.println(reviews);
        return ResponseEntity.ok(reviews);
    }

    // 리뷰 작성
    @PostMapping("/inputReview")
    public Review createReview(@RequestBody Review review, @AuthenticationPrincipal UserDetails userDetails) {

        // 로그인된 사용자의 username을 리뷰에 설정
        review.setUsername(userDetails.getUsername());
        return reviewService.saveReview(review);
    }

   // 리뷰 수정
    @ResponseBody
    @PostMapping("/{movieId}/update")
    public String updateReview(@PathVariable Long id, @PathVariable Long movie_id) {
//        reviewService.updateComment(commentRequestDTO, commentId);
        return "/board/" + id;
    }

   // 리뷰 삭제
    @GetMapping("/{movieId}/remove")
    public String deleteComment(@PathVariable Long id, @PathVariable Long commentId) {
//        reviewService.deleteComment(commentId);
        return "redirect:/board/" + id;
    }
}
