package Class_Problem.classesCreatingBankAccount;

public class Creating_Class {

    public static void main(String[] args) {
        BankAccount  artiAccount = new BankAccount(1614, "arti", 6666);   ///artiAccount is refrence variable

//        for changing value

       /* artiAccount.balance = 123456779;
        artiAccount.name = "ArtiChaple";
        artiAccount.accountNo = 161410010;*/



        System.out.println(artiAccount.accountNo);
        System.out.println(artiAccount.name);
        System.out.println(artiAccount.balance);





        BankAccount nikitaAccount = new BankAccount();   ///artiAccount is refrence variable

//        for changing value

        nikitaAccount.balance = 123456779;
        nikitaAccount.name = "ArtiChaple";
        nikitaAccount.accountNo = 161410010;



        System.out.println(nikitaAccount.accountNo);
        System.out.println(nikitaAccount.name);
        System.out.println(nikitaAccount.balance);
    }

}
