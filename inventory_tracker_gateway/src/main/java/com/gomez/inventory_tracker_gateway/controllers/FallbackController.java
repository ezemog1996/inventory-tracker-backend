package com.gomez.inventory_tracker_gateway.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {
    
    @GetMapping
    public ResponseEntity<String> fallback() {
        return new ResponseEntity<>("Something went wrong", HttpStatus.BAD_GATEWAY);
    }
}
