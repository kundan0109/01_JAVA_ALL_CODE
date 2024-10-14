package Math_Problem.ASSIGNMENTS.METHODS_Assignment;

public class even_odd_02 {
    public static void main(String[] args) {
        System.out.println("Given number is even " + even(5));
        System.out.println("Given number is odd " + odd(5));
    }

    private static boolean odd(int i) {
        return (i % 2 != 0);
    }

    private static boolean even(int i) {
        return (i % 2 == 0);
    }
}
