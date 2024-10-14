package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

public class Leap_Year {
    public static void main(String[] args) {

//        Write a program to check if a year is leap year or not.
        int year = 2006;
        if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)) {
            System.out.printf("Leap Year :-  %d", year);
        }
        else {
            System.out.println("not Leap Year ");
        }


    }
}
