package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

import java.util.Scanner;

public class greatest_Smallest_number {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int large = 0;
        int small = 2147483647;

        for (int num = 1; num <=5; num++) {
            System.out.println("enter your no :- ");
            int value = input.nextInt();

            if (value > large){
                large = value;
            }
//            allInOne.ASSIGNMENTS.out.println(Integer.MAX_VALUE);


            if (value < small){
                small = value;
            }






        }
        System.out.println(large);
        System.out.println(small);

        }
    }


