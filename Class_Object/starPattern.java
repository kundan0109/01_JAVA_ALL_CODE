package Class_Object;

public class starPattern {

    public static void main(String[] args) {

        int n = 4;

        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            for (int coloum = row; coloum >= 1; coloum--) {
                System.out.print(coloum);
            }

            for (int number = 2; number <= row; number++) {
                System.out.print(number);
            }

            System.out.println();
        }

    }

}
