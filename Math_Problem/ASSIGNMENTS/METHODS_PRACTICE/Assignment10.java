package Math_Problem.ASSIGNMENTS.METHODS_PRACTICE;

class A {


    static void m1(int number , int i) {

        System.out.println(number + " *" + i + " = "+ number * i);

    }


    public static void main(String[] args) {

        int number = 15;

        for (int i = 1; i <= 10; i++) {
            A.m1(number, i);

        }

    }


}