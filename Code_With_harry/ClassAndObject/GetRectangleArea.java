package Code_With_harry.ClassAndObject;

import java.util.Scanner;

public class GetRectangleArea {

    public static void main(String[] args) {

        GetRectangleArea obj = new GetRectangleArea();
        int rectangleArea = obj.getDimension();
        System.out.println(rectangleArea);

    }
    int getDimension() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Length : ");
        int length = input.nextInt();
        System.out.println("Enter a Breadth : ");
        int breadth = input.nextInt();

        return getArea(length, breadth);

    }

    int getArea(int length, int breadth){
        int area = length * breadth;

        return area;
    }



}
