package Class_Object.LambdaPractice;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a  number : - ");
        int n = scanner.nextInt();

        if (n % 2 == 0){
            System.out.print("Given number is even ");
        }
        else {
            System.out.println("given number is odd");
        }
    }
}
