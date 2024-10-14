package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {
//        Write a program to calculate the sum of the first and the second last digit of a 5 digit number.

        int number = 55555;

        if (number > 9999 && number < 99999) {

            int FirstDigit = number / 10000;
            number = number / 10;

            int LastSecondDigit = number % 10;

            System.out.println(FirstDigit + LastSecondDigit);


        }


    }


}
