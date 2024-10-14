package Math_Problem.ASSIGNMENTS.METHODS_Assignment;

/*Write a program which will ask the user to enter his/her marks (out of 100).

Define a method that will display grades according to the marks entered as below:

Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail*/

public class grade08 {
    public static void main(String[] args) {
        System.out.println("grade is " + grade(99));
    }

    private static String grade(int number) {
        String str = null;
        if (number > 90 && number < 101) {
            str = "A";
        } else if (number > 50 && number < 90) {
            str = "B";
        } else {
            str = "FAIL";
        }

        return str;
    }
}
