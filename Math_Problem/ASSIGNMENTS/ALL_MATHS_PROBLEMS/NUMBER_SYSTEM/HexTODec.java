package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS.NUMBER_SYSTEM;
import java.util.Scanner;

public class HexTODec {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a hexadecimal number: ");
            String hexInput = scanner.nextLine();
            scanner.close();

            int decimalOutput = hexToDecimal(hexInput);
            System.out.println("The decimal equivalent of hexadecimal number " + hexInput + " is " + decimalOutput + ".");
        }

        public static int hexToDecimal(String hex) {
            int decimalValue = 0;
            int length = hex.length();

            for (int i = 0; i < length; i++) {
                char charAtPosition = hex.charAt(length - 1 - i);
                int value;

                if (charAtPosition >= '0' && charAtPosition <= '9') {
                    value = charAtPosition - '0';
                } else if (charAtPosition >= 'A' && charAtPosition <= 'F') {
                    value = charAtPosition - 'A' + 10;
                } else if (charAtPosition >= 'a' && charAtPosition <= 'f') {
                    value = charAtPosition - 'a' + 10;
                } else {
                    throw new IllegalArgumentException("Invalid hexadecimal character: " + charAtPosition);
                }

                decimalValue += value * Math.pow(16, i);
            }

            return decimalValue;

    }

}
