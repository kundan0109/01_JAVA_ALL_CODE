package Code_With_harry.looping_statement.WHILE_LOOPS;

public class whileUsePrime {
    public static void main(String[] args) {

        int number = 2;

        boolean isPrime = true;
        int i = 2;

        while (i <= number / 2) {
            if (number % i == 0) {
                isPrime = false;
            } else if (number == 2) {
                isPrime = true;
            } else {
                isPrime = true;
            }
            i++;
        }

        if (isPrime) {
            System.out.println("prime ");
        } else {
            System.out.println(" not primme");
        }

    }


}
