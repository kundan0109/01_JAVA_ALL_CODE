package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

public class SumOfAllDigits {
    public static void main(String[] args) {


        //Write a program to calculate the sum of the digits of a 3-digit number.

        int number = 2314;

        String  str = "2314";
        int len = str.length();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            int rem = number % 10;
            sum = sum + rem;
            number = number/10;
        }
        System.out.println(sum);





    }
}
