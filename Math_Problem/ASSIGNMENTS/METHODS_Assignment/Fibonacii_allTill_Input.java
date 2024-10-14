package Math_Problem.ASSIGNMENTS.METHODS_Assignment;

import java.util.Scanner;

public class Fibonacii_allTill_Input {

    public static void main(String[] args) {
        int input = getPosition();
        for (int i = 0; i <= input ; i++) {
            int value = getFibonaciiNumebr(i);
            System.out.println();
            System.out.printf("The numebr for %d positoin is %d", i, value);

        }
    }

    private static int getFibonaciiNumebr(int value) {
        if (value <= 1){
            return value;
        }

        return getFibonaciiNumebr(value - 2) + getFibonaciiNumebr(value - 1);
    }

    private static int getPosition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Place Till want : ");
        return sc.nextInt();
    }
}