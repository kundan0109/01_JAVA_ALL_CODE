package Code_With_harry.looping_statement.FOR_LOOPS;

public class binaryToDecimal {
    public static void main(String[] args) {

        int binary = 1101;
        int decimal = 0;
        int base = 1;

        for (int input = binary; input > 0; input = input / 10) {

            int lastDigit = input % 10;

            decimal = decimal + lastDigit * base;


            base = base * 2;


        }

        System.out.println("Decimal value is " + decimal);


    }
}
