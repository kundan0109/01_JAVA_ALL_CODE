package Class_Problem.classesCreatingBankAccount;

public class BankAccount {
    // HOW BANK ACCOUNT WILL LOOK LIKE
    int accountNo;
    String name;
    double balance;

    static String BANK_NAME = "BANK OF RCB";


    //CONSTRUCTOR correct
    public  BankAccount(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
        // this keyword
    }

    public BankAccount() {
    }


    void deposit(double amount) {
        this.balance += amount;
    }

    void withdraw(double amount) {
        this.balance -= amount;

    }


}
