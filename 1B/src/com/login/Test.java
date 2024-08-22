package com.login;

public class Test {
	public static void main(String[] args) {
        UserLoginState loginState = UserLoginState.getInstance();
        loginState.login("sravya");
        BankingOperations operations = new BankingOperations();
        operations.viewBalance();  
        operations.deposit(100);    
        operations.withdraw(50);    
        loginState.logout();
        operations.viewBalance();  
    }
}
