package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

public class Fibonacci {

    // Method to find the Fibonacci number at a given index using iteration
    public static int getFibonacciIterative(int index) {
        if (index <= 1) {
            return index;
        }

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= index; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    // Main method
    public static void main(String[] args) {
        int index = 10; // Change this value to get Fibonacci number at different index
        System.out.println("Fibonacci number at index " + index + " (iterative): " + getFibonacciIterative(index));
    }
}
