package Math_Problem.ASSIGNMENTS.METHODS_Assignment;

import java.util.Scanner;

public class PrimeFactors_11_ {

    public static void main(String[] args) {
        int input = getInput();
        findPrimeFactors(input);
    }

    private static void findPrimeFactors(int number) {

        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number = number / 2;
        }

        for (int oddNo = 3; oddNo <= Math.sqrt(number); oddNo = oddNo + 2) {

            while (number % oddNo == 0) {
                System.out.print(oddNo + " ");
                number = number / oddNo;
            }
        }

        // so at the end after dividing by 2 and odd numbers the remaining value is prime number so print it directly

        if (number > 2) {
            System.out.print(number);
        }
    }

    private static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        return sc.nextInt();
    }
}
