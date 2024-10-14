package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

public class Reverse_Given_Number {
    public static void main(String[] args) {

        // Write a program to reverse a 3-digit number. E.g.-Number : 132 Output : 231
        int number = 6547;
        int reverse = 0;
        int digit ;

        for (int i = 0; i < 3; i++) {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number/10;

        }
        System.out.println(reverse);
    }
}
