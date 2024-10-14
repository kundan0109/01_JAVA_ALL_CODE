package Inheritance.inheritance;

public class BankAccount {
    public static void main(String[] args) {
        class BankAccount1{
            public double initialBalance;
            BankAccount1(int initialBalance){
                this.initialBalance = initialBalance;
                System.out.println("Initial Balance : " + initialBalance);
            }

            void deposit(int amount){}
            void withdraw(int amount){}
        }

        class SavingAccount extends BankAccount1{
            SavingAccount(int initialBalance) {
                super(initialBalance);
            }

//            SavingAccount(int initialBalance) {
//                super(initialBalance);
//            }


            @Override
            void deposit(int amount) {
                if (amount > 0 ){
                    initialBalance = initialBalance + amount;
                    System.out.println("Deposit amount : " + amount + " New Balance : " + initialBalance);
                }
                else {
                    System.out.println("invalid amount");
                }
            }

            @Override
            void withdraw(int amount) {
                if (amount > 0 && amount < initialBalance-100){
                    initialBalance = initialBalance - amount;
                    System.out.println("Withdraw amount : " + amount + " New Balance : " + initialBalance);

                }
            }


        }

        SavingAccount savingAccount = new SavingAccount(5000);
        savingAccount.deposit(6000);
        savingAccount.withdraw(7000);
    }
}
