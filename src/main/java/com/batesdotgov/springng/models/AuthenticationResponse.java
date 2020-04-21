package com.batesdotgov.springng.models;

public class AuthenticationResponse {
    public String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
