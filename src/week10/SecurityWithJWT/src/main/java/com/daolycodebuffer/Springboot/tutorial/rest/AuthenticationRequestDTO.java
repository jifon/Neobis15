package com.daolycodebuffer.Springboot.tutorial.rest;

import lombok.Data;

@Data
public class AuthenticationRequestDTO {
    private String email;
    private String password;
}
