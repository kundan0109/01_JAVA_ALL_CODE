package Math_Problem.ASSIGNMENTS.CLASS.classesCreatingBankAccount;

public class Creating_Class {

    public static void main(String[] args) {
        BankAccount  artiAccount = new BankAccount();   ///artiAccount is refrence variable

//        for changing value

        artiAccount.balance = 123456779;
        artiAccount.name = "ArtiChaple";
        artiAccount.accountNo = 161410010;



        System.out.println(artiAccount.accountNo);
        System.out.println(artiAccount.name);
        System.out.println(artiAccount.balance);
    }

}
