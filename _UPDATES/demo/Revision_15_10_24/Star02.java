package _UPDATES.demo.Revision_15_10_24;

public class Star02 {
    public static void main(String[] args) {
        int n = 6;
        for (int row = 0; row < n; row++) {
            for (int star = 0; star < row; star++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
