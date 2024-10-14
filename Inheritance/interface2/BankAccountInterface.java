package Inheritance.interface2;

public interface BankAccountInterface {
    public double initialBalance = 0;
    default void setInitialBalance(){

    }
}

class SavingAccount implements BankAccountInterface{


}
