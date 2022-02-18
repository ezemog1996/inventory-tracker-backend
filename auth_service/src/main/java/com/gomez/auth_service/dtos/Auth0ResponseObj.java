package com.gomez.auth_service.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Auth0ResponseObj {
    private String access_token;
    private int expires_in;
    private String id_token;
    private String refresh_token;
    private String token_type;
}
