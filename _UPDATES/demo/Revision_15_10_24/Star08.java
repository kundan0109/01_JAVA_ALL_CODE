package _UPDATES.demo.Revision_15_10_24;

public class Star08 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= 6 - row; i++) {
                System.out.print((i % 2 == 0)? "0 " : "1 ");
            }
            System.out.println();
        }
    }
}


