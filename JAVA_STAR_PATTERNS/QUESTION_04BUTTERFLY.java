package JAVA_STAR_PATTERNS;

public class QUESTION_04BUTTERFLY {
    public static void main(String[] args) {

/*

        char num = 90;


        for (char i = num; i >= num - 25; i--) {
            System.out.print(i + " ");
        }
*/



        /*
         *           *
         * *       * *
         * * *   * * *
         * * * * * * *
         * * *   * * *
         * *       * *
         *           *
         */

        int NumberOfRows = 4;

        // Upper part of the butterfly
        for (int UpperRowChange = 1; UpperRowChange <= NumberOfRows -1; UpperRowChange++) {
            // Left wing
            for (int UpperLeftStar = 1; UpperLeftStar <= UpperRowChange; UpperLeftStar++) {
                System.out.print("* ");
            }
            // Spaces in the middle
            int MidleUpperSpaces = 2 * (NumberOfRows - UpperRowChange);
            for (int j = 1; j <= MidleUpperSpaces; j++) {
                System.out.print("  ");
            }
            // Right wing
            for (int UpperRightStar = 1; UpperRightStar <= UpperRowChange; UpperRightStar++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the butterfly
        for (int LowerRowChange = NumberOfRows; LowerRowChange >= 1; LowerRowChange--) {
            // Left wing
            for (int LowerLeftStar = 1; LowerLeftStar <= LowerRowChange; LowerLeftStar++) {
                System.out.print("* ");
            }
            // Spaces in the middle
            int MiddleLowerSapces = 2 * (NumberOfRows - LowerRowChange);
            for (int j = 1; j <= MiddleLowerSapces; j++) {
                System.out.print("  ");
            }
            // Right wing
            for (int LowerRightStar = 1; LowerRightStar <= LowerRowChange; LowerRightStar++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
