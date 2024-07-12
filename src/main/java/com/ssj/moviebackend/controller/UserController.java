package com.ssj.moviebackend.controller;


import com.ssj.moviebackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PutMapping("/change/{role}")
    public ResponseEntity<Object> changeRole(@AuthenticationPrincipal UserPrinciple userPrinciple,
                                             @PathVariable Role role) {
        userService.changeRole(role,userPrinciple.getUsername());
        return ResponseEntity.ok(true);
    }
}
