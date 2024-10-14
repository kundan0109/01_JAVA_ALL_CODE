package Array.METHODS_02_JAVA;

// VARIABLE ARGUMENTS
//  varargs
// when you have various number of inputs for specific method then we use varargs

public class METHODS04 {

    public static void main(String[] args) {

        System.out.println("for nothing input as parameter is : "+ sum());
        // if you want errer in  0 parameter case then give
        //     private static int sum(int x , int ...arr)  --> it means compulsory one argument

        System.out.println(sum(1, 2));

        System.out.println(sum(1, 2, 3));

        System.out.println(sum(1, 2, 3, 4));

        System.out.println(sum(1, 5,9 ,98, 78, 98, 65));        // one method is enough

    }

    private static int sum(int ...arr) {
//        int [ ] arr;   available as aarray
        int result = 0;
        for (int element : arr){
            result = result + element;
        }
        return result;

    }


    /*private static int sum(int i, int i1, int i2) {
        return i+ i1+ i2;
    }*/

   /* private static int sum(int i, int i1) {
        return i+i1;
    }*/


}
