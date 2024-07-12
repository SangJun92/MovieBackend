package com.ssj.moviebackend.service;

import org.apache.catalina.User;

import javax.management.relation.Role;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    Optional<User> findByUsername(String username);
    void changeRole(Role newRole, String username);
}
