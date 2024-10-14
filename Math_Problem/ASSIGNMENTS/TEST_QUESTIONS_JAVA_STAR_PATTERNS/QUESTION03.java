package Math_Problem.ASSIGNMENTS.TEST_QUESTIONS_JAVA_STAR_PATTERNS;

public class QUESTION03 {
    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {
            //SPACE
            for (int space = 1; space <= 4 - row; space++) {
                System.out.print(" ");
            }

            // NUMBER
            for (int num = row; num >= 1; num--) {
                System.out.print(num);

            }

            // RIGHTNumber

            for (int num = 2; num<= row; num++) {
                System.out.print(num);

            }

            System.out.println();

        }
    }
}

