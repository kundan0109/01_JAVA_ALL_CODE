package JAVA_STAR_PATTERNS;

public class QUESTION_04 {
    public static void main(String[] args) {

        /*
         *           *
         * *       * *
         * * *   * * *
         * * * * * * *
         * * *   * * *
         * *       * *
         *           *
         */


        int rows = 7; // Adjust this value for a different number of rows
        int dashes = rows - 2; // Calculate the number of dashes based on rows

        for (int i = 1; i <= rows; i++) {
            int stars = (i <= rows / 2) ? 2 * i - 1 : 2 * (rows - i + 1) - 1;
            int spaces = (rows - stars) / 2; // Calculate spaces for centered stars

            // Print leading spaces (if any)
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print first half stars
            for (int j = 1; j <= stars / 2; j++) {
                System.out.print("*");
            }

            // Print dashes (if any)
            for (int j = 1; j <= dashes; j++) {
                System.out.print("");
            }

            // Print second half stars (if any)
            for (int j = stars / 2 + 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }
    }
}





