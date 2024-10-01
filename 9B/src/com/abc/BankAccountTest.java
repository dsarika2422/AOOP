package com.abc;

public class BankAccountTest {
	public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread depositThread1 = new Thread(() -> {
            account.deposit(100);
        });

        Thread depositThread2 = new Thread(() -> {
            account.deposit(200);
        });
        Thread withdrawThread1 = new Thread(() -> {
            account.withdraw(50);
        });

        Thread withdrawThread2 = new Thread(() -> {
            account.withdraw(300); 
        });

    
        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
        withdrawThread2.start();

        
        try {
            depositThread1.join();
            depositThread2.join();
            withdrawThread1.join();
            withdrawThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        System.out.printf("Final Balance: %.2f%n", account.getBalance());
    }
}
