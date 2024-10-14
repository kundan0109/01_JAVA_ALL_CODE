package Practice01;

import java.util.Scanner;

public class Greatest_Smallest_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int large = 0;
        int small = 2147483647;

        for (int num = 1; num <= 5; num++) {
            System.out.println("enter your no :- ");
            int value = input.nextInt();

            if (value > large) {
                large = value;
            }
//            System.out.println(Integer.MAX_VALUE);


            if (value < small) {
                small = value;
            }


        }
        System.out.println("Greatest no :- " + large);
        System.out.println("Smallest no :- " + small);

    }
}


