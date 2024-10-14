package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS.NUMBER_SYSTEM;

public class OctalToDecimal {
    public static void main(String[] args) {

        int octal = 12345;
        int decimal = 0;
        int base = 1;


        while (octal > 0){

            int digit = octal % 10 ;

            decimal = decimal + base;

            base = base * 8;

            octal = octal / 10;


        }

        System.out.println( " decimal is " + decimal);


    }

}
