package Math_Problem;


public class BankAccount {
    int accountNumber;
    String holderName;
    int balance;
    static double interestRate;

    BankAccount(int accountNumber, String holderName, int balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(int deposit) {
        balance = balance + deposit;
    }

    void withDraw(int withdraw) {
        balance = balance - withdraw;
    }

    static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    void calculateInterest() {

    }

    public static void main(String[] args) {

        setInterestRate(10.0);
        BankAccount bankAccount1 = new BankAccount(11, "nayan", 100000);
        BankAccount bankAccount2 = new BankAccount(22, "tejas", 200000);
        BankAccount bankAccount3 = new BankAccount(33, "lalit", 600000);



    }

}
    /*
### 2. *Bank Account System*

*Description:* Create a class BankAccount with the following components:
- Instance variables: accountNumber, holderName, balance.
- Static variable: interestRate.

*Tasks:*
- Create a constructor to initialize the accountNumber, holderName, and balance.
- Write methods deposit(double amount) and withdraw(double amount) to modify the balance.
- Write a static method setInterestRate(double rate) to set the interest rate for all accounts.
- Write a method calculateInterest() to calculate interest based on the current balance and interest rate.
- In the main method, create multiple BankAccount objects, set the interest rate, perform transactions, and calculate interest.
 */

