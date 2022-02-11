package com.gomez.auth_service.services;

import java.net.URI;
import java.net.URISyntaxException;

import com.gomez.auth_service.consumers.UserConsumer;
import com.gomez.auth_service.dtos.Auth0RequestObj;
import com.gomez.auth_service.dtos.Auth0ResponseObj;
import com.gomez.auth_service.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthServiceImpl implements AuthService {

    @Value("${auth0.audience}")
    private String audience;
    @Value("${auth0.new-token-uri}")
    private String auth0Uri;
    @Value("${auth0.client-id}")
    private String clientId;
    @Value("${auth0.client-secret}")
    private String clientSecret;
    @Value("${auth0.grant-type}")
    private String grantType;

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
        // URI uri = new URI(auth0Uri);
        // Auth0RequestObj requestObj = new Auth0RequestObj(clientId, clientSecret, audience, grantType);
        // ResponseEntity<Auth0ResponseObj> response = rt.postForEntity(uri, requestObj, Auth0ResponseObj.class);
        // System.out.println(response);
        retrievedUser.setPassword(null);
        return retrievedUser;
    }
    
}
