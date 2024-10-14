package Code_With_harry.looping_statement.DO_WHILE_LOOPS;

public class DoWhileUsePrime {

    public static void main(String[] args) {
        int number = 66;

        boolean isPrime = true;
        int it = 2;

        do {
            if (number % it != 0) {
                isPrime = true;
            }
            else if (number == 2) {
                isPrime = true;
            }
            else {
                isPrime = false;
                break;
            }
            it++;
        } while (it <= number / 2);

        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime ");
        }
    }


}
