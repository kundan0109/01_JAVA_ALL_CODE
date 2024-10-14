package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

public class Prime_No {
    public static void main(String[] args) {

        int no = 1;


        for (int number = 2; number <= no; number++) {
            boolean isPrime = true;

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime == false) {
                System.out.printf("%d is not a Prime no ", number);
                System.out.println();
            } else {
                System.out.printf("%d is a Prime no ", number);
                System.out.println();
            }

        }
    }
}
