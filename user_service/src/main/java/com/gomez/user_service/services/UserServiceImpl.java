package com.gomez.user_service.services;

import com.gomez.user_service.daos.UserRepository;
import com.gomez.user_service.dtos.UserDTO;
import com.gomez.user_service.exceptions.EmailExistsException;
import com.gomez.user_service.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository ur;
    private PasswordEncoder pe;

    @Autowired
    public UserServiceImpl(UserRepository ur, PasswordEncoder pe) {
        super();
        this.ur = ur;
        this.pe = pe;
    }

    @Override
    public UserDTO registerUser(User user) throws EmailExistsException {
        if (ur.findByEmail(user.getEmail()) != null) {
            throw new EmailExistsException();
        }
        user.setPassword(pe.encode(user.getPassword()));
        User savedUser = ur.save(user);

        return new UserDTO(savedUser.getUserId(), savedUser.getEmail(), savedUser.getRole(), savedUser.getBusinessId());
    }

    @Override
    public User getUserForAuth(String email) {
        return ur.findByEmail(email);
    }
    
}
