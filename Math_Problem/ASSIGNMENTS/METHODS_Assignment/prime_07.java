package Math_Problem.ASSIGNMENTS.METHODS_Assignment;


//Define a method to find out if number is prime or not.
public class prime_07 {
    public static void main(String[] args) {
        int number = 71;
        boolean isPrime = true;

        if (number == 1 && number == 2) {
            isPrime = true;
        } else if (number >=3 ) {
            for (int i = 2; i <= number / 2; i++) {

                if ( number % i == 0){
                    isPrime = false;
                }

            }

        }
        System.out.println(isPrime);
    }
}