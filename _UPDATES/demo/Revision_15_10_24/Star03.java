package _UPDATES.demo.Revision_15_10_24;

public class Star03 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print( row+" ");
            }
            System.out.println();
        }
    }
}
