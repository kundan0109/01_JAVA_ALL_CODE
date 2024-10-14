package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

public class Swap_Values {

    public static void main(String[] args) {

//    Suppose the values of variables 'a' and 'b' are 6 and 8 respectively, write two programs to swap the values of the two variables.
//
//1 - first program by using a third variable
//
//2 - second program without using any third variable

        int a = 1;
        int b = 2;
        b = a+b; //3
        a = b - a; // 2
        b = b - a;
        System.out.printf("%d a  and %d b ", a, b);


    }


}
