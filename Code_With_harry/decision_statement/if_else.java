package Code_With_harry.decision_statement;

import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a age :-  ");

        int age = sc.nextInt();
        if (age > 50)
            System.out.println("old");
        else
            System.out.println("young");
    }
}
