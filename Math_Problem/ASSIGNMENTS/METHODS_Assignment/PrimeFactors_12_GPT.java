package Math_Problem.ASSIGNMENTS.METHODS_Assignment;

import java.util.Scanner;

public class PrimeFactors_12_GPT {

    public static void main(String[] args) {
        int input = getInput();
        findPrimeFactors(input);
    }

    private static void findPrimeFactors(int number) {
        // Check for the number of 2s that divide number
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        // number must be odd at this point, thus skip even numbers and iterate only for odd numbers
        for (int oddNo = 3; oddNo <= Math.sqrt(number); oddNo += 2) {
            // While oddNo divides number, print it and divide number
            while (number % oddNo == 0) {
                System.out.print(oddNo + " ");
                number /= oddNo;
            }
        }

        // This condition is to handle the case when number is a prime number greater than 2
        if (number > 2) {
            System.out.print(number + " ");
        }
    }

    private static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        return sc.nextInt();
    }
}
