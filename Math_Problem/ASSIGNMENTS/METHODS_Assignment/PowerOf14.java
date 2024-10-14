package Math_Problem.ASSIGNMENTS.METHODS_Assignment;

public class PowerOf14 {
//    static int x = 5;
//
//    static int y = 3;

    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int k = powerOf(x, y);
        System.out.println(k);


    }

    //
    private static int powerOf(int x, int y) {

        if (y <= 0 ){
            return 1;
        }

        return x * powerOf(x, y - 1);

    }

}
