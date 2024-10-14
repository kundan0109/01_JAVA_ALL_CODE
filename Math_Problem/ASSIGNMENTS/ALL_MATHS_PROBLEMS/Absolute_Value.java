package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

import java.util.Scanner;

public class Absolute_Value {
    public static void main(String[] args) {
        /*// Example values
        int number1 = -10;
        int number2 = 25;

        // Convert to absolute value
        int absValue1 = getAbsoluteValue(number1);
        int absValue2 = getAbsoluteValue(number2);

        // Print the results
        allInOne.ASSIGNMENTS.out.println("The absolute value of " + number1 + " is: " + absValue1);
        allInOne.ASSIGNMENTS.out.println("The absolute value of " + number2 + " is: " + absValue2);
    }

    // Method to return the absolute value of an integer
    public static int getAbsoluteValue(int number) {
        return number < 0 ? -number : number;
    */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : - ");

        float number = input.nextFloat();
        if (number > 0) {
            System.out.printf("Absolute value :- %f ", number);
        } else {
            number = -number;
            System.out.printf("Absolute value :- %f ", number);
        }

    }
}
