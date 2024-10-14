package Code_With_harry.CodeWithHarry_Practice.Methods;

public class method_02 {
    /*
        static  void  foo(){
            System.out.println("GOOD MORNING");
        }
        static void foo(int x , int y){
            System.out.println("good morning and night ");
        }
        static int sum(int k, int t){
            int z = k+t;
            return z;
        }


     */
/*
    static int add(int... arr) {
        int result = 0;
        for (int a : arr) {
            result = result + a;
        }
        return result;

    }

 */
//////////VARARRAY
    static int add(int...arr){
        int sum = 0;
        for ( int element : arr){
            sum += element;
        }
        return sum;
    }


        public static void main (String[]args){


//        int a = 5, b = 6 , p;
//        foo();
//        foo(a , b);
//        p = sum(a=5 , b=6);
//        System.out.println(p);


            System.out.println(add(1, 2));
            System.out.println(add(2, 3, 4));
            System.out.println(add(4, 5, 6));
            System.out.println(add(1, 2, 3, 4, 5, 6));


        }
    }
