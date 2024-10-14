package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

import java.util.Scanner;

public class GIven_no_Type {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take a number as input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Determine if the number is positive, negative, or zero using a switch statement

//        signum  method is use to classify negative positive and 0


        switch (Integer.signum(number)) {
            case 1:
                System.out.println("The number is positive.");
                break;
            case -1:
                System.out.println("The number is negative.");
                break;
            case 0:
                System.out.println("The number is zero.");
                break;
            default:
                System.out.println("Unexpected value.");
                break;
        }


    }
}



