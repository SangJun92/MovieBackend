package com.ssj.moviebackend.repository;

import com.ssj.moviebackend.model.Review;
import com.ssj.moviebackend.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    Optional<Review> findById(String username);

//    @Modifying
//    @Query("update Review set role=:role where username=:username")
//    void updateReviewBy(@Param("username") String username, @Param("role") Role role);
}
