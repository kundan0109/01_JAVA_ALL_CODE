package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

import java.util.Scanner;

public class Average_Of_Input {
    public static void main(String[] args) {
//        Scanner input = new Scanner(allInOne.ASSIGNMENTS.System.in);


//        int n = 100;
//        int sum = 0;
//        int product = 1;
//        int count = 0;
        /*allInOne.ASSIGNMENTS.out.println("Enter Press 'q' to quit from program : ");
        for (int i = 0; i < n; i++) {
            allInOne.ASSIGNMENTS.out.println("Enter a number : ");
            int number = input.nextInt();
            if(number == (char)'q'){
                break;
            }
            sum = sum + number;
            product = product * number;
            count ++;



        }
        allInOne.ASSIGNMENTS.out.printf("The sum of all numbers is  %d" , sum);
        allInOne.ASSIGNMENTS.out.printf("The product of all numbers is  %d" , product);*/


        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long product = 1; // Use long to handle larger product values
        int count = 0;

        while (true) {
            System.out.print("Enter an integer (press 'q' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
                product *= number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of the numbers: " + average);
            System.out.println("Product of the numbers: " + product);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();


    }
}
