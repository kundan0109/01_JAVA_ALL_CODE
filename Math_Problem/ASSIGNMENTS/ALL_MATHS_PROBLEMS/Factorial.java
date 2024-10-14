package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

public class Factorial {
    public static void main(String[] args) {

        int noTill = 20;
        for (int number = 1; number <= noTill ; number++) {


            int result = 1;

            for (int fact = 1; fact <= number; fact++) {
                result = result * fact;

            }
            System.out.printf("Factorial of %d is %d",noTill, result   );
            System.out.println();
        }



    }
}
