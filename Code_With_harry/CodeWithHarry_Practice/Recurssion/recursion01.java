package Code_With_harry.CodeWithHarry_Practice.Recurssion;

public class recursion01 {

    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        else {
            return n * factorial(n -1);
        }
    }

    public static int addAllNumber( int n){


        for (int i = 0; i < 5; i++) {
            
        }
        return 10;




    }


    public static void main(String[] args) {
        int x = 6;
        System.out.println("Factorial value is " + factorial(x) );

        addAllNumber(x);
    }
}

