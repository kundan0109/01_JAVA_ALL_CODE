package Math_Problem.ASSIGNMENTS.METHODS_Assignment;

import java.util.Scanner;

public class Fibonacii_Position12 {


    public static int getValue(int position){
        if (position <= 1){
            return position;
        }
        return getValue( position - 1) + getValue( position - 2) ;
    }


    private static int getPosition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Position of fibo series : ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int position = getPosition();
        int result = getValue(position);
        System.out.printf("So the value of fibo at %d is %d", position, result);
    }
}
