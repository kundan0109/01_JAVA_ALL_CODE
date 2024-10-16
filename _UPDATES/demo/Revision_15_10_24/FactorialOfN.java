package _UPDATES.demo.Revision_15_10_24;

public class FactorialOfN {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;

        for (int i = 1; i <= n ; i++) {
            fact *= i;
        }

        System.out.println("your factorial of " + n + " is " + fact);
    }
}
