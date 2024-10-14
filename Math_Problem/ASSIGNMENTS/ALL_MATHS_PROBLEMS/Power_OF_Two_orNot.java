package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

import java.util.Scanner;

public class Power_OF_Two_orNot {

//        Program to check if a number is a power of two.
    // 1, 2, 4, 8, 16, 32, 64, 128, 256.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPowerOfTwo = false;

        if (number > 0) {
            int temp = number;
            while (temp % 2 == 0) {
                temp = temp / 2;
            }
            if (temp == 1) {
                isPowerOfTwo = true;
            }
        }

        if (isPowerOfTwo) {
            System.out.println(number + " is a power of two.");
        } else {
            System.out.println(number + " is not a power of two.");
        }


   /* public static void main(String[] args) {

        Scanner input = new Scanner(allInOne.ASSIGNMENTS.System.in);
        allInOne.ASSIGNMENTS.out.println(" Enter your number :- ");
        int number = input.nextInt();
        boolean isPowerTwo = false;

        if (number > 0) {

            while (number % 2 == 0) {
                number = number / 2;
            }

            if (number == 1) {
                isPowerTwo = true;
            }

        }

        if (isPowerTwo == true) {
            allInOne.ASSIGNMENTS.out.println("power of two");
        } else {
            allInOne.ASSIGNMENTS.out.println("Not power of two");
        }*/


    }
}
