package Inheritance.abstraction;

abstract class BankAccounts{
    protected int initialBalance ;

    public BankAccounts (int initialBalance){
        this.initialBalance = initialBalance;
        System.out.println(" Balance before the Transition : " + initialBalance);
    }

    abstract void deposite(int depositAmount);

    abstract void withdraw(int withdrawAmount);

}

class SavingAccount extends BankAccounts{
    public SavingAccount (int balance){
        super(balance);
    }

    @Override
    void deposite(int depositAmount) {
        if (depositAmount > 0 ){
            initialBalance = initialBalance + depositAmount;
            System.out.println("deposite Amount is : " + depositAmount + " and new balance is : " + initialBalance);
        }
        else {
            System.out.println("Invalid amount");
        }
    }

    @Override
    void withdraw(int withdrawAmount) {
        if (withdrawAmount > 0 && withdrawAmount < initialBalance){
            initialBalance = initialBalance - withdrawAmount;
            System.out.println("withdraw Amount is : "  + withdrawAmount + " and new balance is : " + initialBalance);
        }
    }
}


class CurrentAccount extends BankAccounts{

    public static final double OVER_DRAFT_LIMIT = 500;

    public CurrentAccount(int initialBalance){
        super(initialBalance);
    }

    @Override
    void deposite(int depositAmount) {
        if (depositAmount > 0 ){
            initialBalance = initialBalance + depositAmount;
            System.out.println("deposite Amount is : " + depositAmount + " and new balance is : " + initialBalance);
        }

    }

    @Override
    void withdraw(int withdrawAmount) {
        if (withdrawAmount > 0 && ((initialBalance - withdrawAmount) > - 500)){
            initialBalance = initialBalance - withdrawAmount;
            System.out.println("withdraw Amount is : "  + withdrawAmount + " and new balance is : " + initialBalance);
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(500);
        savingAccount.deposite(600);
        savingAccount.withdraw(900);

        CurrentAccount currentAccount = new CurrentAccount(1000);
        currentAccount.deposite(500);
        currentAccount.withdraw(655);
    }
}
