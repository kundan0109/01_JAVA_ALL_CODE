package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

import java.util.Scanner;

public class posNegCount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int positive = 0, negative = 0, zeros = 0;

        int n = 10;
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

        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zeros);


    }
}


