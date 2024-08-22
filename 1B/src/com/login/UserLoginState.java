package com.login;

public class UserLoginState {
	private static UserLoginState instance;
    private boolean loggedIn;
    private String username;

    private UserLoginState() {
        loggedIn = false;
        username = "";
    }

    public static UserLoginState getInstance() {
        if (instance == null) {
            instance = new UserLoginState();
        }
        return instance;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void login(String username) {
        this.username = username;
        this.loggedIn = true;
    }

    public void logout() {
        this.username = "";
        this.loggedIn = false;
    }

    public String getUsername() {
        return username;
    }
}
