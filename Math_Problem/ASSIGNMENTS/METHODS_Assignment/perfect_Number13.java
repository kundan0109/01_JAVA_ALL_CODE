package Math_Problem.ASSIGNMENTS.METHODS_Assignment;

import java.util.Scanner;

/*
Define a method named 'perfect' that determines if parameter number is a perfect number.
Use this function in a program that determines and prints all the perfect numbers between 1 and 1000.
*/
public class perfect_Number13 {
    public static void main(String[] args) {
        int input = inputNumber();
        boolean check = findPerfectNumbers(input);
        if (check == true) {
            System.out.printf("%d number is perfect numbre here is your list " , input);
            System.out.println();
            printAllPerfectNumbers();
        } else {
            System.out.println("Input is not a perfect number ");
        }

    }

    private static void printAllPerfectNumbers() {
        for (int input = 1; input <= 10000; input++) {
            int number = input;
            int sum = 0;
//            boolean cond = true;

            for (int i = 1; i <= input / 2; i++) {
                if (input % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == number) {
                System.out.printf("Perfect number is %d", number);
                System.out.println();
            }


        }


    }

    private static boolean findPerfectNumbers(int input) {
        int number = input;
        int sum = 0;
        boolean cond = true;

        for (int i = 1; i <= input / 2; i++) {
            if (input % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            cond = true;
        } else {
            cond = false;
        }

        return cond;

    }


    private static int inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number : ");
        return sc.nextInt();
    }
}
