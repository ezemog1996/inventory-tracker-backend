package com.gomez.auth_service.controllers;

import java.net.URISyntaxException;

import com.gomez.auth_service.dtos.Auth0ResponseObj;
import com.gomez.auth_service.dtos.ClientAuthObj;
import com.gomez.auth_service.services.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
    public ResponseEntity<Auth0ResponseObj> loginUser(@RequestBody ClientAuthObj clientAuthObj) throws URISyntaxException {
        return new ResponseEntity<Auth0ResponseObj>(as.loginUser(clientAuthObj), HttpStatus.OK);
    }

    @GetMapping("/authTest")
    public String testAuth() {
        return "it worked!";
    }
}
