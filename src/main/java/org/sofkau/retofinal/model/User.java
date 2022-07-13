package org.sofkau.retofinal.model;

public class User {
    private Boolean emailState;
    private String email;

    public User() {
    }

    public User(Boolean name, String email) {
        this.emailState = name;
        this.email = email;
    }

    public Boolean getEmailState() {
        return emailState;
    }

    public String getEmail() {
        return email;
    }

    public void setEmailState(Boolean emailState) {
        this.emailState = emailState;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
