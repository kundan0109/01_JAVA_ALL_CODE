package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

import java.util.Scanner;

public class Square_Root {


    // Program to check if a number is a perfect square.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPerfectSquare = false;
        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) {
                isPerfectSquare = true;
                break;
            }
        }

        if (isPerfectSquare) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }


    }

}
