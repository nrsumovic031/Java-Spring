package com.example.demo.model.request;

public class RequestUser {
    private String username;
    private String password;

    public RequestUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public RequestUser() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RequestUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
