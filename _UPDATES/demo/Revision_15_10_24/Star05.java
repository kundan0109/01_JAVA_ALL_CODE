package _UPDATES.demo.Revision_15_10_24;

public class Star05 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print((col % 2 == 0) ? "1 " : "0 ");
            }
            System.out.println();
        }
    }
}
