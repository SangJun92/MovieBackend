package com.ssj.moviebackend.service;

import com.ssj.moviebackend.model.Role;
import com.ssj.moviebackend.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    Optional<User> findByUsername(String username);
    void changeRole(Role newRole, String username);
}
