package bankaccountmanager;

import java.util.HashMap;
import java.util.HashSet;

public class BankAccountManager {
	private HashMap<String, BankAccount> accounts;
    private HashSet<String> accountIds;

    public BankAccountManager() {
        accounts = new HashMap<>();
        accountIds = new HashSet<>();
    }

    public boolean addAccount(String accountId, String accountHolderName) {
        if (accountIds.add(accountId)) {
            BankAccount account = new BankAccount(accountId, accountHolderName);
            accounts.put(accountId, account);
            return true;
        }
        return false; 
    }

    public BankAccount getAccount(String accountId) {
        return accounts.get(accountId);
    }

    public void deposit(String accountId, double amount) {
        BankAccount account = getAccount(accountId);
        if (account != null) {
            account.deposit(amount);
        }
    }

    public void withdraw(String accountId, double amount) {
        BankAccount account = getAccount(accountId);
        if (account != null) {
            account.withdraw(amount);
        }
    }

    public void displayAccounts() {
        for (BankAccount account : accounts.values()) {
            System.out.println(account);
        }
    }
}
