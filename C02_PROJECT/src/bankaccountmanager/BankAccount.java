package bankaccountmanager;

public class BankAccount {
	private String accountId;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountId, String accountHolderName) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "Account ID: " + accountId + ", Holder: " + accountHolderName + ", Balance: " + balance;
    }
}
