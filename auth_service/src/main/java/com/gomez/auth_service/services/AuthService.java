package com.gomez.auth_service.services;

import java.net.URISyntaxException;

import com.gomez.auth_service.dtos.Auth0ResponseObj;
import com.gomez.auth_service.dtos.ClientAuthObj;

public interface AuthService {
    Auth0ResponseObj loginUser(ClientAuthObj clientAuthObj) throws URISyntaxException;
}
