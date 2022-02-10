package com.gomez.auth_service.controllers;

import com.gomez.auth_service.models.User;
import com.gomez.auth_service.services.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private AuthService as;

    @Autowired
    public AuthController(AuthService as) {
        super();
        this.as = as;
    }
    
    @PostMapping
    public ResponseEntity<User> loginUser(@RequestBody User user) {
        return new ResponseEntity<User>(as.loginUser(user), HttpStatus.OK);
    }
}
