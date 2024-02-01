package com.sunbase.customer_management_system.dto;

import lombok.Data;

@Data
public class AuthenticationResponse {
    private String jwt;
    private String role;

    public AuthenticationResponse(String jwt, String role) {
        this.jwt = jwt;
        this.role = role;
    }

}

