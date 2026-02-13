package Task_3;
import java.util.Scanner;
public class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }
    
    public void start(){
        System.out.println("Welcome to the ATM!");
        System.out.println("--------------------");
        boolean running = true;
        while (running) {
            System.out.println("Select an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("\nEnter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(account.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    try{
                        double depositAmount = scanner.nextDouble();
                        if(depositAmount < 0) {
                            throw new IllegalArgumentException("Deposit amount cannot be negative.");
                        }
                        if(!String.valueOf(depositAmount).matches("\\d+(\\.\\d+)?")) {
                            throw new IllegalArgumentException("Deposit amount must be a valid number.");
                        }
                        System.out.println(account.deposit(depositAmount));
                    }catch (Exception e) {
                        System.out.println("An error occurred: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    try{
                        double withdrawAmount = scanner.nextDouble();
                        if(withdrawAmount < 0) {
                            throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
                        }
                        if(!String.valueOf(withdrawAmount).matches("\\d+(\\.\\d+)?")) {
                            throw new IllegalArgumentException("Withdrawal amount must be a valid number.");
                        }
                        System.out.println(account.withdraw(withdrawAmount));
                    } catch (Exception e) {
                        System.out.println("An error occurred: " + e.getMessage());
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String accountNumber;
        double initialBalance;
        System.out.print("Enter account number (12 Digits): ");
        accountNumber = scanner.nextLine();
        try{
            if(accountNumber.length() != 12) {
                throw new IllegalArgumentException("Account number must be 12 digits.");
            }
            if(!accountNumber.matches("\\d{12}")) {
                throw new IllegalArgumentException("Account number must contain only digits.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            return;
        }
        System.out.print("Enter initial balance: ");
        initialBalance = scanner.nextDouble();
        try{
            if(initialBalance < 0) {
                throw new IllegalArgumentException("Initial balance cannot be negative.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        BankAccount account = new BankAccount(accountNumber, initialBalance);
        ATM atm = new ATM(account);
        atm.start();
    }
}
