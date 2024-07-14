package com.ssj.moviebackend.service;


import com.ssj.moviebackend.model.User;

public interface AuthenticationService {
    public User signInAndReturnJWT(User signInRequest);
}
