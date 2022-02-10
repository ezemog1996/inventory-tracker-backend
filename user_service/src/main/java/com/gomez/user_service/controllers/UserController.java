package com.gomez.user_service.controllers;

import com.gomez.user_service.dtos.UserDTO;
import com.gomez.user_service.exceptions.EmailExistsException;
import com.gomez.user_service.models.User;
import com.gomez.user_service.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {

    private UserService us;

    @Autowired
    public UserController(UserService us) {
        super();
        this.us = us;
    }
    
    @PostMapping
    public ResponseEntity<UserDTO> registerUser(@RequestBody User user) {
        try {
            return new ResponseEntity<>(us.registerUser(user), HttpStatus.CREATED);
        } catch (EmailExistsException e) {
            return new ResponseEntity<>(null, HttpStatus.OK);
        }
    }

    @GetMapping("/auth")
    public ResponseEntity<User> getUserForAuth(@RequestParam(name = "email") String email) {
        return new ResponseEntity<User>(us.getUserForAuth(email), HttpStatus.OK);
    }
}
