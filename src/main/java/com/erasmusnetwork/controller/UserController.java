package com.erasmusnetwork.controller;

import com.erasmusnetwork.model.User;
import com.erasmusnetwork.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/searchUsers")
    public ResponseEntity<List<User>> searchUsers(
            @RequestParam(required = false) String location,
            @RequestParam(required = false) String program,
            @RequestParam(required = false) String university,
            @RequestParam(required = false) String country
    ) {
        List<User> users = userRepository.searchUsers(location, program, university, country);
        return ResponseEntity.ok(users);
    }
}