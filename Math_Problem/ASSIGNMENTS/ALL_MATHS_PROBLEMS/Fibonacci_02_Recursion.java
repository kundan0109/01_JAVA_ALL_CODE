package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

class Fibonacci_02_Recursion {

    // Method to find the Fibonacci number at a given index using recursion
    public static int getFibonacciRecursive(int index) {
        if (index <= 1) {
            return index;
        }
        return getFibonacciRecursive(index - 1) + getFibonacciRecursive(index - 2);
    }

    // Main method
    public static void main(String[] args) {
        int index = 10; // Change this value to get Fibonacci number at different index
        System.out.println("Fibonacci number at index " + index + " (recursive): " + getFibonacciRecursive(index));
    }
}
