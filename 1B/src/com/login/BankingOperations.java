package com.login;

public class BankingOperations {
	public void viewBalance() {
        UserLoginState loginState = UserLoginState.getInstance();
        if (loginState.isLoggedIn()) {
            System.out.println("Viewing balance for user: " + loginState.getUsername());
        } else {
            System.out.println("User not logged in.");
        }
    }

    public void deposit(double amount) {
        UserLoginState loginState = UserLoginState.getInstance();
        if (loginState.isLoggedIn()) {
            System.out.println("Depositing " + amount + " for user: " + loginState.getUsername());
        } else {
            System.out.println("User not logged in.");
        }
    }

    public void withdraw(double amount) {
        UserLoginState loginState = UserLoginState.getInstance();
        if (loginState.isLoggedIn()) {
            System.out.println("Withdrawing " + amount + " for user: " + loginState.getUsername());
        } else {
            System.out.println("User not logged in.");
        }
    }
}
