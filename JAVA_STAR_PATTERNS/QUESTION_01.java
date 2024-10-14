package JAVA_STAR_PATTERNS;

public class QUESTION_01 {
    public static void main(String[] args) {

        for (int row = 1; row <= 3; row++) {

            for (int space = 1; space <= 3 - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row - 1; star++) {
                System.out.print("*");
            }
            for (int num = row; num == row; num++) {
                System.out.print(num);
            }
            for (int star = 1; star <= row - 1; star++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
