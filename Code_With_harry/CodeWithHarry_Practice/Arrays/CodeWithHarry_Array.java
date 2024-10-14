package Code_With_harry.CodeWithHarry_Practice.Arrays;

public class CodeWithHarry_Array {
    public static void main(String[] args) {
/*
        int [] marks = new int[5];
        marks[0] = 55;
        marks[1] = 44;
        marks[2] = 33;
        marks[3] = 22;
        marks[4] = 11;
        System.out.println(marks[0]);
*/


/*
        int [] total ;
        total = new int[5];
        System.out.println(total[5]);



        /*
        int [] count = {55, 66, 87, 98, 56};
        System.out.println(count[4]);
         */

//        int [] zen = {56, 89, 45, 32, 54, 87};
//        System.out.println(zen.length);
//        for (int i = 0; i < zen.length; i++) {
//            System.out.println(zen[i]);
//        }

//        for (int j : zen) {
//            System.out.println(j);


//          REVERSE ORDER

//        int [] sale = {55, 66, 77, 88, 99};
//        System.out.println(sale.length);
//        for (int reverse = sale.length- 1 ; reverse >= 0 ; reverse--) {
//            System.out.print (sale[reverse] + " ");
//        }

//          FOR EACH
//        int [] marks = {45, 98, 87, 32, 51};
//        for (int elements : marks){
//            System.out.println(elements);
//        }


//        float [] percent = {55.6F, 65.7f, 65.8f, 98.9f };
//        for (float elements : percent){
//            System.out.print(elements + " ");
//        }


//        // MULTI DIMENSIONAL ARRAY  WORKING


//        int [][] sales = new int[2][3];
//        sales [0][0]= 101;
//        sales [0][1]= 102;
//        sales [0][2]= 103;
//        sales [1][0]= 201;
//        sales [1][1]= 202;
//        sales [1][2]= 203;
//        System.out.println(sales.length);
//        for (int outer = 0; outer < sales.length; outer++) {
//            for (int inner = 0; inner < sales[outer].length; inner++) {
//                System.out.print(sales[outer][inner] +" ");
//            }
//            System.out.println();
//
//        }


//              WORKING
//        int[] marks; // A 1-D Array
//        int[][] flats; // A 2-D Array
//        flats = new int[2][3];
//        flats[0][0] = 101;
//        flats[0][1] = 102;
//        flats[0][2] = 103;
//        flats[1][0] = 201;
//        flats[1][1] = 202;
//        flats[1][2] = 203;
//
//        // Displaying the 2-D Array (for loop)
//        System.out.println("Printing a 2-D array using for loop");
//        for (int i = 0; i < flats.length; i++) {
//            for (int j = 0; j < flats[i].length; j++) {
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }

/*
        // SUM OF FLOATS

        float[] marks = {45.6f, 654.6f, 98.4f, 65.265f, 787.65f};
        float sum = 0;
        for (float elements : marks) {
            sum = sum + elements;
        }
        System.out.println(sum);


 */
        ////////////////////////////////////////////////////////////////////////////////////////////
        //REVERSE AN ARRAY
//
//        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//
//        for (int i = 0; i < n; i++) {
//            // arr[i] swap with arr[l-1-i]
//            temp = arr[i];
//            arr[i] = arr[l-1-i];
//            arr[l-1-i] = temp;
//        }
//
//        for (int  element : arr ){
//            System.out.print(element + " ");
//
//        }


//        int [] numbers = {11, 22, 33, 55, 66 ,88 };
//        int l = numbers.length;
//        int n = Math.floorDiv(l, 2);
//        int temp ;
//
//        for (int reverse = 0; reverse <= n ; reverse++) {
//            temp = numbers[reverse];
//            numbers[reverse] = numbers[l-1-reverse];
//            numbers[l-1-reverse] = temp;
//        }
//
//        for (int element : numbers){
//            System.out.print(element + " ");
//        }


// FINDING THE GREATEST OF AN ARRAY

//        int[] marks = { 12, 65, 798, 656, 455, 12, 46989 , 1};
//        int max = 0;
//        for (int element : marks){
//            if (element>max){
//                max = element;
//            }
//        }
//        System.out.println(max);


//        int [] array = {999, 55, 78, 88989898, 657, 745,221};
//
//        int max = 0;
//
//        for (int big = 0; big < array.length ; big++) {
//
//            if (max > array[big]){
//                max =max ;
//            }
//            else {
//                max = array[big];
//            }
//
//        }
//        System.out.println(max);


//////////MAXIMUM AND MINIMUM VALUES IN INT DATA TYPE KNOWN

//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);


        // FINDING SMALLEST OF ALL IN ARRAY

//        int[] marks = {12, 65, 798, 656, 455, 12, 46989, 1};
//        int min = 2147483647 ;
//        for (int element : marks) {
//            if (element < min) {
//                min = element;
//            }
//        }
//        System.out.println(min);


//        int[] min = { 22, 12, 54, 11,9,  16, 798 };
//
//        int smallest = min[0];
//
//        for (int i = 1; i < min.length; i++) {
//            if (min[i] < smallest) {
//                smallest = min[i];
//            }
//        }
//        System.out.println(smallest);




    }
}
