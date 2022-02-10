package com.gomez.auth_service.services;

import com.gomez.auth_service.consumers.UserConsumer;
import com.gomez.auth_service.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private UserConsumer uc;
    private PasswordEncoder pe;
    
    @Autowired
    public AuthServiceImpl(UserConsumer uc, PasswordEncoder pe) {
        super();
        this.uc = uc;
        this.pe = pe;
    }

    @Override
    public User loginUser(User user) {
        User retrievedUser = uc.getUserForAuth(user.getEmail());
        if (retrievedUser == null || !pe.matches(user.getPassword(), retrievedUser.getPassword())) {
            return null;
        }
        retrievedUser.setPassword(null);
        return retrievedUser;
    }
    
}
