package com.example.demo.model.request;

public class RequestPutUser {

    private String username;
    private String password;
    private String address;

    public RequestPutUser(String username, String password, String address) {
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public RequestPutUser() {
    }

    @Override
    public String toString() {
        return "RequestPutUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
