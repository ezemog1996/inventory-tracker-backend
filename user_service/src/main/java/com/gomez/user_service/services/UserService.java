package com.gomez.user_service.services;

import com.gomez.user_service.dtos.UserDTO;
import com.gomez.user_service.models.User;

public interface UserService {
    UserDTO registerUser(User user);
    User getUserForAuth(String email);
}
