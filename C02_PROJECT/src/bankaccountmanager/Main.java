package bankaccountmanager;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BankAccountManager manager = new BankAccountManager();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Add Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Accounts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Account ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String name = scanner.nextLine();
                    if (manager.addAccount(id, name)) {
                        System.out.println("Account added successfully.");
                    } else {
                        System.out.println("Account ID already exists.");
                    }
                    break;
                case 2:
                    System.out.print("Enter Account ID: ");
                    String depositId = scanner.nextLine();
                    System.out.print("Enter Amount to Deposit: ");
                    double depositAmount = scanner.nextDouble();
                    manager.deposit(depositId, depositAmount);
                    System.out.println("Deposit successful.");
                    break;
                case 3:
                    System.out.print("Enter Account ID: ");
                    String withdrawId = scanner.nextLine();
                    System.out.print("Enter Amount to Withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    manager.withdraw(withdrawId, withdrawAmount);
                    System.out.println("Withdrawal successful.");
                    break;
                case 4:
                    manager.displayAccounts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}