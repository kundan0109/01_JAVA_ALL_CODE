package JAVA_STAR_PATTERNS;

public class QUESTION_05 {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {

            System.out.print("1");

            for (int col = 2; col <= 6 - row ; col++) {
                System.out.print("*" + col);
            }
            System.out.println();

        }
    }
}
