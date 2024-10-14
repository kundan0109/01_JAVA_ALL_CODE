package Math_Problem.ASSIGNMENTS.ALL_STAR_PATTERNS;

public class Adiba_triangle {
    public static void main(String[] args) {

        int n = 5;

        for (int rows = 0; rows < n; rows++) {        //for rows change

            for (int spaces = 0; spaces < n - rows; spaces++) {        // for spaces in single row
                System.out.print(" ");
            }

            for (int star = 1; star <= 2 * rows + 1; star++) {      //for star at each row
                System.out.print("*");
            }

            System.out.println();       // for changing the row
        }


    }
}
