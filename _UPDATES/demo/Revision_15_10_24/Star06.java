package _UPDATES.demo.Revision_15_10_24;

public class Star06 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= 6 - row; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
