package Code_With_harry.inClassProblems;

public class All_Patterns_Problems {
    public static void main(String[] args) {


////////////////////////////////////////////////////////////
//    /*
//     * * * * *
//     * * * * *
//     * * * * *
//     * * * * *
//     * * * * *
//
//     * */
//    public static void main(String[] args) {
//        for (int row = 1; row <=5 ; row++) {
//            for (int col = 1; col <=5 ; col++) {
//                System.out.print(" * " );
//            }
//            System.out.println();
//        }
//    }
        //////////////////////////////////////////////////////////////////
    /*
//             *
//            **
//           ***
//          ****
//         *****
//
//         */
//
//        for (int row = 1; row <= 5 ; row++){
//            // spaces
//            for (int spaces = 1; spaces<= 5-row; spaces++){
//                System.out.print(" ");
//            }
//
//            // star
//            for (int star = 1; star <= row; star++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        /////////////////////////////////////////////////////////////////////////

//        /*
//             *
//            * *
//           * * *
//          * * * *
//         * * * * *
//         */
//        for (int row = 1; row <= 5 ; row++){
//            // spaces
//            for (int spaces = 1; spaces<= 5-row; spaces++){
//                System.out.print(" ");
//            }
//
//            // star
//            for (int star = 1; star <= row; star++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
/////////////////////////////////////////////////////////////////////////////////
//        for (int row = 5; row>=1; row--){
//            for (int space = 5 ; space > 5-row; space--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // ARTII DIAMOND
        //////////////////////////////////////////////////////////////////////////////

//            /*
//
//               *
//              * *
//             * * *
//              * *
//               *
//
//             */
//
//                int n=3;
//                for(int row=1;row<=n;row++){
////               space
//
//                    for(int space=1;space<=n-row;space++){
//                        System.out.print(" ");
//                    }
////                strars
//                    for(int col=1;col<=row;col++){
//                        System.out.print("* ");
//                    }
//                    System.out.println();
//                }
//
////                for outer loop
//                for(int row=n-1;row >=1;row--)
//                {
////            space
//                    for(int space=1;space<=n-row;space++)
//                    {
//                        System.out.print(" ");
//                    }
//                    for (int col=1;col<=row;col++)
//                    {
//                        System.out.print("* ");
//                    }
//
//                    System.out.println();
//                }

        //////////////////////////////////////////////////////////////////////
//        //MY DIAMOND
//
//        //FOR THE FIRST LOOP
//        int num = 3;
//        //SPACES
//        for (int row = 1; row <=num-row; row++) {
//            System.out.println("-");
//        }
//        //STARS
//        for (int star = 1; star <=num-star; star++) {
//
//
//        }


        ////
        /*

         * * * *
          * * *
           * *
            *
           * *
          * * *
         * * * *

         */
//
        /*

                int n=4;
                for(int row=n;row >=1;row--)
                {
//            space
                    for(int space=1;space<=n-row;space++)
                    {
                        System.out.print(" ");
                    }
                    for (int col=1;col<=row;col++)
                    {
                        System.out.print("* ");
                    }

                    System.out.println();

                }

                for(int row=2; row<=n;row++){

                    //space
                    for(int space=1;space<=n-row;space++)
                    {
                        System.out.print(" ");
                    }

//            star
                    for (int col=1;col<=row;col++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();

                }

         */



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        //PRINT
//        /*
//        1 0 1 0 1
//        1 0 1 0
//        1 0 1
//        1 0
//        1
//         */
//
//        for (int row = 5 ; row >= 1 ; row-- ){
//            for (int col = 1 ; col <= row; col++){
//                System.out.print(col%2==0? " 1 ": " 0 ");
//            }
//            System.out.println();
//        }

/////////////////////////////////////////////////////////////////////////////////////////////

//            UPPER TRIANGLE
//        /*
//         *
//         **
//         ***
//         ****
//         *****
//         */
//            System.out.println("Enter a number --> ");
//            int num = sc.nextInt();
//            for (int i = 1 ; i <= num ; i++){
//                for (int j = 1 ; j <= i ; j++ ){
//                    System.out.print("*");
//                }
//                System.out.println(" ");
//            }
/////////////////////////////////////////////////////////////////////////////////////////////////


//    /*

//     *
//     * *
//     * * *
//     * * * *
//     * * * * *

//     * */
//    public static void main(String[] args) {
//        for (int row = 1; row <= 5; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    /*/
//
//    1
//    2 2
//    3 3 3
//    4 4 4 4
//    5 5 5 5 5
//
//    * */
//    public static void main(String[] args) {
//        for (int row = 1; row <= 5; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(row + " ");
//            }
//            System.out.println();
//        }
//    }

////////////////////////////////////////////////////////////////////////
//
//    /*
//
//    1
//    1 2
//    1 2 3
//    1 2 3 4
//    1 2 3 4 5
//
//    * */
//    public static void main(String[] args) {
//        for (int row = 1; row <= 5; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }
//    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//    /*
//
//     1
//     1 0
//     1 0 1
//     1 0 1 0
//     1 0 1 0 1
//
//     * */
//    public static void main(String[] args) {
//        for (int row = 1; row <= 5; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print((col % 2 == 0 ? "0" : "1") + " ");
//            }
//            System.out.println();
//        }
//    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//    /*
//
//     * * * * *
//     * * * *
//     * * *
//     * *
//     *
//
//     * */
//    public static void main(String[] args) {
//        for (int row = 5; row >= 1; row--) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

///////////////////////////////////////////////////////////////////////////////
//    /*
//
//   1 1 1 1 1
//   2 2 2 2
//   3 3 3
//   4 4
//   5
//    * */
//    public static void main(String[] args) {
//        int count = 1;
//        for (int row = 5; row >= 1; row--) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(count+" ");
//            }
//            System.out.println();
//            count++;
//        }
//    }
/////////////////////////////////////////////////////////////////////////////////////////////////

//    /*
//       1 2 3 4 5
//       1 2 3 4
//       1 2 3
//       1 2
//       1
//    * */
//    public static void main(String[] args) {
//        for (int row = 5; row >= 1; row--) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(col+" ");
//            }
//            System.out.println();
//        }
//    }
//////////////////////////////////////////////////////////////////////////////////////////////
//
//    /*
//     *
//     * *
//     * * *
//     * * * *
//     * * * * *
//
//     * */
//        for(int row = 1; row <=5 ; row++){
//        //space
//        for (int space = 1; space <=5-row ; space++) {
//            System.out.print(" ");
//        }
//        //star
//        for (int star = 1; star <=row ; star++) {
//            System.out.print("*");
//        }
//        System.out.println();
//    }
///////////////////////////////////////////////////////////////////////////////////////////////

//         /*
//                1
//              1 2
//            1 2 3
//          1 2 3 4
//        1 2 3 4 5
//        * */
//        for (int row = 1; row <= 5; row++) {
//        //spaces
//        for (int space = 1; space <=5-row ; space++) {
//            System.out.print(" ");
//        }
//        //values
//        for (int value = 1; value <=row ; value++) {
//            System.out.print(value);
//        }
//        System.out.println();
//    }
/////////////////////////////////////////////////////////////////////////////////////////
//    /*
//     * * * * *
//     * * * *
//     * * *
//     * *
//     *
//     * */
//        for (int row = 5; row >=1 ; row--) {
//        //space
//        for (int space = 1; space <=5-row ; space++) {
//            System.out.print(" ");
//        }
//        for (int value = 1; value <=row; value++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*

    1
    01
    101
    0101
    10101
     */

//        for (int row = 1; row <= 5; row++) {
//
//            if (row % 2 == 0) {
//                for (int even = 1; even <= row; even++) {
//                    System.out.print(even % 2 == 0 ? "1" : "0");
//                }
//            } else {
//                for (int odd = 1; odd <= row; odd++) {
//                    System.out.print(odd % 2 == 0 ? "0" : "1");
//                }
//            }
//            System.out.println();
//        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}