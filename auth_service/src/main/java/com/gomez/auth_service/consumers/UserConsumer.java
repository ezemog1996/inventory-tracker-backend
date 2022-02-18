package com.gomez.auth_service.consumers;

import com.gomez.auth_service.models.User;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "USER-SERVICE")
public interface UserConsumer {
    
    @GetMapping("/users/auth")
    public User getUserForAuth(@RequestParam(name = "email") String email);
}
