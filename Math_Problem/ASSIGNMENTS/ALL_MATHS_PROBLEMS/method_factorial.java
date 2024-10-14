package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

public class method_factorial {


    public static void main(String[] args) {

        int noTill = 4;
        for (int number = noTill; number >= 1; number--) {
            method_factorial.fact(number);

        }
    }

    static void fact(int number) {

        int result = 1;

        for (int fact = 1; fact <= number; fact++) {
            result = result * fact;

        }
        System.out.printf("Factorial of is %d", result);
        System.out.println();


    }
}


