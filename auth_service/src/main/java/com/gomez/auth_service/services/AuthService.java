package com.gomez.auth_service.services;

import com.gomez.auth_service.models.User;

public interface AuthService {
    User loginUser(User user);
}
