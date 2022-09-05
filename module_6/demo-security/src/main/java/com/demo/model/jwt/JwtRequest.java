package com.demo.model.jwt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class JwtRequest implements Serializable {
    private static final long serialVersionUID = 5926468583005150707L;
    private String useName;
    private String password;
    private String token;
    private String confirmPassword;

    public JwtRequest() {
    }

    public JwtRequest(String useName, String password) {
        this.useName = useName;
        this.password = password;
    }

    public JwtRequest(String useName, String password, String token) {
        this.useName = useName;
        this.password = password;
        this.token = token;
    }

    public JwtRequest(String useName, String password, String token, String confirmPassword) {
        this.useName = useName;
        this.password = password;
        this.token = token;
        this.confirmPassword = confirmPassword;
    }


    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
