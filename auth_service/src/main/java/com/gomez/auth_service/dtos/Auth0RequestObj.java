package com.gomez.auth_service.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Auth0RequestObj {
    private String client_id;
    private String client_secret;
    private String grant_type;
    private String code;
    private String redirect_uri;
}