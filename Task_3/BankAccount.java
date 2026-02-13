package Task_3;
public class BankAccount {
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return "Deposited: " + amount + "Rs. New balance: " + balance + "Rs.";
        } else {
            return "Invalid deposit amount.";
        }
    }

    public String withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return "Withdrew: " + amount;
        } else {
            return "Invalid withdrawal amount or insufficient funds.";
        }
    }
    public String checkBalance(){
        return "Current balance: " + balance;
    }

}
