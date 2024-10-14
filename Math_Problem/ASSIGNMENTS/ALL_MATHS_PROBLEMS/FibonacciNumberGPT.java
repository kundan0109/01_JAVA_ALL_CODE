package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

import java.util.Scanner;

public class FibonacciNumberGPT {

    // Method to calculate the Fibonacci number at a given position using recursion
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Method to get the user's input for the position
    public static int getPositionFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position of the Fibonacci number: ");
        return scanner.nextInt();
    }

    // Method to display the Fibonacci number at the given position
    public static void displayFibonacciNumber(int position) {
        int fibonacciNumber = fibonacci(position);
        System.out.println("The Fibonacci number at position " + position + " is: " + fibonacciNumber);
    }

    public static void main(String[] args) {
        int position = getPositionFromUser();
        displayFibonacciNumber(position);
    }
}
