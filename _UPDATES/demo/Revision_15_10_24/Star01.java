package _UPDATES.demo.Revision_15_10_24;

public class Star01 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 0; row < n; row++) {
            for (int star = 0; star < n; star++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
