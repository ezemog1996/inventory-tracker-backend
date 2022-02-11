package com.gomez.auth_service.services;

import java.net.URISyntaxException;

import com.gomez.auth_service.models.User;

public interface AuthService {
    User loginUser(User user) throws URISyntaxException;
}
