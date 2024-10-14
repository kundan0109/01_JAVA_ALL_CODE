package Array.ARRAYS_01_JAVA;
//you can make arr of any data type..int float.. char .. .string

public class array02 {
    public static void main(String[] args) {
        int[] str = {5, 6, 8, 0, 656, 5};


        // Naive way....cheap or not advance
        //analogy...to print all elements u can print using sout also --> Naive way


//        Advance Way       --> still lengthy
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);         //array traversal
//        }

        for (int element : str){
            System.out.println(element);
        }



        System.out.println(str.length);//length function



    }


}
