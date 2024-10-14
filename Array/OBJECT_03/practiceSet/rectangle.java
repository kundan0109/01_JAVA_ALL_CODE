package Array.OBJECT_03.practiceSet;

import java.util.Scanner;

public class rectangle {
    int length;
    int breadth;

    public static void main(String[] args) {

        int length = rectangle.getLength();
        int breadth = rectangle.getBreadth();

        getArea(length, breadth);
        getParameter(length, breadth);
    }

    private static void getParameter(int length, int breadth) {
        System.out.println( 2 * length + 2 * breadth+ " peremeter ");
    }

    private static void getArea(int length, int breadth) {
        System.out.println(length * breadth + " area ");
    }

    private static int getLength() {
        rectangle side = new rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a length  of rect : ");
        int length = sc.nextInt();
        return length;

    }
    private static int getBreadth() {
        rectangle side = new rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a breadth  of rect : ");
        int breadth = sc.nextInt();
        return breadth;

    }


}
