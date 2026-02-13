# ATM INTERFACE
>Task 3- CodSoft JAva Programming Internship

# Description 
This project is a console-based simulation of an Automated Teller Machine (ATM) developed as part of the CodeSoft internship. It demonstrates Object-Oriented Programming (OOP) principles by separating the user interface (`ATM` class) from the business logic (`BankAccount` class).

# Key Features
> Secure Account Access:
* Validates that the entered Account Number is exactly 12 digits long.
* Ensures the Account Number contains only numeric digits.
> Banking Operations:
* Check Balance: View the current account balance instantly.
* Deposit: Add funds to the account with validation to prevent negative inputs.
* Withdraw: Withdraw funds with strict checks for sufficient inputs.
> Robust Error Handling:
* Prevents the application from crashing if the user enters text instead of numbers.
* Provides clear error messages for invalid transactions (e.g., insufficient funds).

# How to Run
1.> Compile the code:
Open your terminal or command prompt in the project folder and run:
```bash
javac ATM.java BankAccount.java
```

2.> Run the Application:
```bash
java ATM
```

# Example Usage
```text
Enter account number (12 Digits): 123456789012
Enter initial balance: 5000
Welcome to the ATM!
--------------------
Select an option:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Enter your choice:
3
Enter amount to withdraw: 2000
Withdrew: 2000.0
Select an option:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Enter your choice:
1
Current balance: 3000.0
Select an option:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Enter your choice:
4
Thank you for using the ATM!
```
