package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

public class Add_2_to_Each_Digit {
    public static void main(String[] args) {


        /*Take a 4 digit number. Write a program to display a number whose digits are 2 greater than the corresponding digits of the number TAKEN.

        For example, if the number which was taken is 5696, then the displayed number should be 7818.

         */

        int number = 2146;

        int thousands = number / 1000;
        int hundred = number / 100 % 10;
        int tens = number / 10 % 10;
        int unit = number % 10;

//        allInOne.ASSIGNMENTS.out.printf("%d, %d, %d, %d",thousands, hundred, tens, unit );
        thousands = (thousands +2 ) * 1000;
        hundred = (hundred +2 ) * 100;
        tens = (tens +2 ) * 10;
        unit = (unit + 2);
        System.out.println(thousands+hundred+tens+unit);


    }
}
