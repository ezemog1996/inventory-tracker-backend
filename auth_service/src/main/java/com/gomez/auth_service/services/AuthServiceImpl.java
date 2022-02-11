package com.gomez.auth_service.services;

import java.net.URI;
import java.net.URISyntaxException;

import com.gomez.auth_service.consumers.UserConsumer;
import com.gomez.auth_service.dtos.Auth0RequestObj;
import com.gomez.auth_service.dtos.Auth0ResponseObj;
import com.gomez.auth_service.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
    public User loginUser(User user) throws URISyntaxException {
        User retrievedUser = uc.getUserForAuth(user.getEmail());
        if (retrievedUser == null || !pe.matches(user.getPassword(), retrievedUser.getPassword())) {
            return null;
        }
        // RestTemplate rt = new RestTemplate();
        // URI uri = new URI("https://dev-hd772wgr.us.auth0.com/oauth/token");
        // Auth0RequestObj requestObj = new Auth0RequestObj("GFWrGwZM9msYMu6QoTJMjQihGyBbLVtQ", "CJ7vIp238ZKcL2UWohpSOp6yuDLYvVYJJlG5fb-OduqkqEE9S0cPQPlnwRAeC_Px", "https://inventorytracker.com", "client_credentials");
        // ResponseEntity<Auth0ResponseObj> response = rt.postForEntity(uri, requestObj, Auth0ResponseObj.class);
        // System.out.println(response);
        retrievedUser.setPassword(null);
        return retrievedUser;
    }
    
}
