package Math_Problem;

import java.util.Scanner;

public class Pos_Neg_Input_Count {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int positive = 0, negative = 0, zeros = 0;

        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter your age : - ");
            int age = input.nextInt();


            if (age > 0) {
                positive = positive + 1;
            } else if (age < 0) {
                negative = negative + 1;
            } else {
                zeros = zeros + 1;
            }

        }

        System.out.println("Positive age  :  " + positive);
        System.out.println("Negative age  :  " + negative);
        System.out.println("Zero age  :  " + zeros);


    }
}


