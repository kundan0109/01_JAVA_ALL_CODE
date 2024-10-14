package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

import java.util.Scanner;

public class AgeComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input of ages of three people
        System.out.println("Enter the age of the first person:");
        int age1 = scanner.nextInt();
        System.out.println("Enter the age of the second person:");
        int age2 = scanner.nextInt();
        System.out.println("Enter the age of the third person:");
        int age3 = scanner.nextInt();

        // Variables to store the oldest and youngest ages
        int oldest = age1;
        int youngest = age1;

        // Finding the oldest age
        switch (age1 > age2 ? (age1 > age3 ? 1 : 3) : (age2 > age3 ? 2 : 3)) {
            case 1:
                oldest = age1;
                break;
            case 2:
                oldest = age2;
                break;
            case 3:
                oldest = age3;
                break;
        }

        // Finding the youngest age
        switch (age1 < age2 ? (age1 < age3 ? 1 : 3) : (age2 < age3 ? 2 : 3)) {
            case 1:
                youngest = age1;
                break;
            case 2:
                youngest = age2;
                break;
            case 3:
                youngest = age3;
                break;
        }

        // Output the oldest and youngest ages
        System.out.println("The oldest age is: " + oldest);
        System.out.println("The youngest age is: " + youngest);

        // Closing the scanner
        scanner.close();
    }
}
