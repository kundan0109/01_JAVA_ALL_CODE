package Array.OBJECT_03.practiceSet;

import java.util.Scanner;

public class square {
    int side;

    public static void main(String[] args) {

        int side = getInput();

        getArea(side);
        getParameter(side);
    }

    private static void getParameter(int side) {
        System.out.println(4 * side + " peremeter ");
    }

    private static void getArea(int side) {
        System.out.println(side * side + " area ");
    }

    private static int getInput() {
        square side = new square();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a side of square : ");
        int k = sc.nextInt();
        return side.side = k;
    }


}
