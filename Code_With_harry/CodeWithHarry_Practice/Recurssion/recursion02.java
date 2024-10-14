package Code_With_harry.CodeWithHarry_Practice.Recurssion;

public class recursion02 {


    static int add(int x) {
        if (x == 1) {
            return 1;
        }
        return x + add(x - 1);
    }

    static int fibo(int x) {
        if (x == 1) {
            return 0;
        } else if (x == 2) {
            return 1;
        } else {
            return fibo(x - 1) + fibo(x - 2);
        }
    }

    static void star(int z) {
        if (z > 0) {
            star(z - 1);
            for (int i = 0; i < z; i++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {


        /*
        //METHOD TO SUM FIRST N NATURAL NUMBERS
        int sum ;
        sum = add(5);
        System.out.println(sum);

         */

        /*
        // FIBONACII SERIES
        int result = fibo(5);
        System.out.println(result);

         */
/*
        for (int i = 1; i < 20; i++) {
            int result = fibo(i);
            System.out.println(result);

 */
        /*
        // STAR PATTERN USING RECURSION
        star(10);

         */

    }
}



