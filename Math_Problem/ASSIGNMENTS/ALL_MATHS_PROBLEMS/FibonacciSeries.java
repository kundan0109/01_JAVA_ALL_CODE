package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

import java.util.Scanner;

public class FibonacciSeries {

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
        System.out.print("Enter the position up to which Fibonacci numbers are to be printed: ");
        return scanner.nextInt();
    }

    // Method to display all Fibonacci numbers up to the given position
    public static void displayFibonacciSeries(int position) {
        System.out.println("Fibonacci series up to position " + position + ":");
        for (int i = 0; i <= position; i++) {
            System.out.println("Position " + i + ": " + fibonacci(i));
        }
    }

    public static void main(String[] args) {
        int position = getPositionFromUser();
        displayFibonacciSeries(position);
    }
}
