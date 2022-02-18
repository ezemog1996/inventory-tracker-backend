package com.gomez.auth_service.services;

import java.net.URI;
import java.net.URISyntaxException;

import com.gomez.auth_service.dtos.Auth0RequestObj;
import com.gomez.auth_service.dtos.Auth0ResponseObj;
import com.gomez.auth_service.dtos.ClientAuthObj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
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
    
    @Autowired
    public AuthServiceImpl() {
        super();
    }

    @Override
    public Auth0ResponseObj loginUser(ClientAuthObj clientAuthObj) throws URISyntaxException {
        RestTemplate rt = new RestTemplate();
        URI uri = new URI(auth0Uri);
        Auth0RequestObj requestObj = new Auth0RequestObj(clientId, clientSecret, grantType, clientAuthObj.getCode(), clientAuthObj.getRedirect_uri());
        ResponseEntity<Auth0ResponseObj> response = rt.postForEntity(uri, requestObj, Auth0ResponseObj.class);
        return response.getBody();
    }
    
}
