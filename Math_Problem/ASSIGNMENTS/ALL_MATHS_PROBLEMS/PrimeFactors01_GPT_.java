package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

import java.util.Scanner;

class PrimeFactors01 {

    // Method to get the user's input for the number
    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its prime factors: ");
        return scanner.nextInt();
    }

    // Method to print the prime factors of the given number
    public static void printPrimeFactors(int number) {
        System.out.print("Prime factors of " + number + " are: ");

        // Print the number of 2s that divide number
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        // Number must be odd at this point, so we can skip even numbers
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            // While i divides number, print i and divide number
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        // This condition is to handle the case when number is a prime number
        // greater than 2
        if (number > 2) {
            System.out.print(number);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int number = getNumberFromUser();
        printPrimeFactors(number);
    }
}
