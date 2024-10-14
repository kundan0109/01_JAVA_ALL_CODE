package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

public class PrimeFactors {

    // Method to print the prime factors of a given number
    public static void printPrimeFactors(int number) {
        // Edge case: if the number is less than 2, it has no prime factors
        if (number < 2) {
            System.out.println("No prime factors.");
            return;
        }

        // Print the number of 2s that divide number
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        // number must be odd at this point, so we can skip even numbers
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
    }

    public static void main(String[] args) {
        int number = 60; // You can change this number to test other numbers
        System.out.print("Prime factors of " + number + " are: ");
        printPrimeFactors(number);
    }
}
