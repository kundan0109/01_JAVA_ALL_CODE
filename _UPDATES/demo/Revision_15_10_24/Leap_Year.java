package _UPDATES.demo.Revision_15_10_24;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = scanner.nextInt();
        System.out.println((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))? year + " is leap year" : year + " is not leap year");
    }
}
