package Math_Problem.ASSIGNMENTS.METHODS_Assignment;

//Create a class named 'PrintNumber' to print various numbers of different datatypes by creating
// different methods with the same name 'printn' having a parameter for each datatype.

public class PrintNumber16  {
    public static void main(String[] args) {
        int i = 1056565;
        byte b = 25;
        short s = 6689;
        long l = 989895656;
        char c = 'c';
        float f = 656556565656.8989898f;
        double d = 9898898787878787878778.5656565655656565656d;
        boolean bl = false;

        printn(i, b, s, l, c, f, d, bl);
    }

    private static void printn(int i, byte b, short s, long l, char c, float f, double d, boolean bl) {
        System.out.println(i);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        System.out.println(c);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bl);
    }

}
