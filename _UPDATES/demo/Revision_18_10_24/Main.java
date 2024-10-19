//package _UPDATES.demo.Revision_18_10_24;
//
//import java.util.Scanner;
//
//class BankAccount {
//    // Account details
//    private String accountNumber;
//    private String password;
//    private double balance;
//
//    // Constructor to initialize account details
//    public BankAccount(String accountNumber, String password, double balance) {
//        this.accountNumber = accountNumber;
//        this.password = password;
//        this.balance = balance;
//    }
//
//    // Method to validate login
//    public boolean login(String enteredAccountNumber, String enteredPassword) {
//        return this.accountNumber.equals(enteredAccountNumber) && this.password.equals(enteredPassword);
//    }
//
//    // Method to check balance
//    public void checkBalance() {
//        Systems.out.println("Current balance: $" + balance);
//    }
//
//    // Method to deposit money
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//            Systems.out.println("Successfully deposited $" + amount);
//        } else {
//            Systems.out.println("Deposit amount must be greater than 0");
//        }
//    }
//
//    // Method to withdraw money
//    public void withdraw(double amount) {
//        if (amount > 0 && amount <= balance) {
//            balance -= amount;
//            Systems.out.println("Successfully withdrew $" + amount);
//        } else if (amount > balance) {
//            Systems.out.println("Insufficient balance!");
//        } else {
//            Systems.out.println("Withdraw amount must be greater than 0");
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(Systems.in);
//
//        // Create a sample bank account
//        BankAccount account = new BankAccount("123456789", "password123", 1000.0);
//
//        // Prompt the user to log in
//        Systems.out.println("Welcome to the Bank System");
//        Systems.out.print("Enter account number: ");
//        String enteredAccountNumber = scanner.nextLine();
//
//        Systems.out.print("Enter password: ");
//        String enteredPassword = scanner.nextLine();
//
//        // Check login details
//        if (account.login(enteredAccountNumber, enteredPassword)) {
//            Systems.out.println("Login successful!");
//
//            while (true) {
//                // Display menu options
//                Systems.out.println("\nPlease choose an option:");
//                Systems.out.println("1. Check Balance");
//                Systems.out.println("2. Deposit Money");
//                Systems.out.println("3. Withdraw Money");
//                Systems.out.println("4. Exit");
//
//                int choice = scanner.nextInt();
//
//                switch (choice) {
//                    case 1:
//                        account.checkBalance();
//                        break;
//
//                    case 2:
//                        Systems.out.print("Enter deposit amount: ");
//                        double depositAmount = scanner.nextDouble();
//                        account.deposit(depositAmount);
//                        break;
//
//                    case 3:
//                        Systems.out.print("Enter withdrawal amount: ");
//                        double withdrawAmount = scanner.nextDouble();
//                        account.withdraw(withdrawAmount);
//                        break;
//
//                    case 4:
//                        Systems.out.println("Thank you for using the Bank System. Goodbye!");
//                        Systems.exit(0);
//
//                    default:
//                        Systems.out.println("Invalid choice, please try again.");
//                }
//            }
//        } else {
//            Systems.out.println("Invalid account number or password. Please try again.");
//        }
//
//        scanner.close();
//    }
//}
