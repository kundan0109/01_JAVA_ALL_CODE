package Math_Problem.ASSIGNMENTS.TEST_QUESTIONS_JAVA_STAR_PATTERNS;

public class QUESTION_04BUTTERFLY {
    public static void main(String[] args) {


        char num =90;



        for (char i = num; i>=num-25; i--) {
            System.out.print(i+ " ");
        }



        /*
         *           *
         * *       * *
         * * *   * * *
         * * * * * * *
         * * *   * * *
         * *       * *
         *           *
         */
/*
        int NumberOfRows = 4;

        // Upper part of the butterfly
        for (int UpperRowChange = 1; UpperRowChange <= NumberOfRows -1; UpperRowChange++) {
            // Left wing
            for (int UpperLeftStar = 1; UpperLeftStar <= UpperRowChange; UpperLeftStar++) {
                allInOne.ASSIGNMENTS.out.print("* ");
            }
            // Spaces in the middle
            int MidleUpperSpaces = 2 * (NumberOfRows - UpperRowChange);
            for (int j = 1; j <= MidleUpperSpaces; j++) {
                allInOne.ASSIGNMENTS.out.print("  ");
            }
            // Right wing
            for (int UpperRightStar = 1; UpperRightStar <= UpperRowChange; UpperRightStar++) {
                allInOne.ASSIGNMENTS.out.print("* ");
            }
            allInOne.ASSIGNMENTS.out.println();
        }

        // Lower part of the butterfly
        for (int LowerRowChange = NumberOfRows; LowerRowChange >= 1; LowerRowChange--) {
            // Left wing
            for (int LowerLeftStar = 1; LowerLeftStar <= LowerRowChange; LowerLeftStar++) {
                allInOne.ASSIGNMENTS.out.print("* ");
            }
            // Spaces in the middle
            int MiddleLowerSapces = 2 * (NumberOfRows - LowerRowChange);
            for (int j = 1; j <= MiddleLowerSapces; j++) {
                allInOne.ASSIGNMENTS.out.print("  ");
            }
            // Right wing
            for (int LowerRightStar = 1; LowerRightStar <= LowerRowChange; LowerRightStar++) {
                allInOne.ASSIGNMENTS.out.print("* ");
            }
            allInOne.ASSIGNMENTS.out.println();
        }

*/
    }
}
