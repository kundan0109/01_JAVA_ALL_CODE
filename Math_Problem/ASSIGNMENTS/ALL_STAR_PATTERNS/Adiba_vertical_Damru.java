package Math_Problem.ASSIGNMENTS.ALL_STAR_PATTERNS;

public class Adiba_vertical_Damru {
    public static void main(String[] args) {
        int rows = 5;

        // Upper part of the pattern
        for (int upRows = 0; upRows < rows; upRows++) {         //for chaninng the rows
            for (int upSpaces = 0; upSpaces < upRows; upSpaces++) {
                System.out.print("-");                  // Print space
            }
            for (int upStar = upRows; upStar < rows; upStar++) {
                System.out.print("*");                  // Print star
            }
            System.out.println();
        }

        // Lower part of the pattern


        for (int downRows = 1; downRows < rows; downRows++) {
            for (int Spaces = 0; Spaces < 4; Spaces++) {
                System.out.print("-");                  // Print space
            }
            for (int Star = 0; Star <= downRows; Star++) {
                System.out.print("*");                       // Print star
            }
            System.out.println();
        }
    }
}
