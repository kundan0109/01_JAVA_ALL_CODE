package Code_With_harry.NUMBER_SYSTEM;

public class binaryToDecimal {
    public static void main(String[] args) {

        int binary = 1101;
        int decimal = 0;
        int base = 1;


        while (binary > 0){
            int lastdigit = binary % 10 ;

            decimal = decimal + lastdigit * base;

            base = base * 2;

            binary = binary / 10;


        }
        System.out.println( " decimal is " + decimal);






    }
}
