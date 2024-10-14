package Math_Problem.ASSIGNMENTS.ALL_STAR_PATTERNS;

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
//                allInOne.ASSIGNMENTS.out.print(" * " );
//            }
//            allInOne.ASSIGNMENTS.out.println();
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
//                allInOne.ASSIGNMENTS.out.print(" ");
//            }
//
//            // star
//            for (int star = 1; star <= row; star++){
//                allInOne.ASSIGNMENTS.out.print("*");
//            }
//            allInOne.ASSIGNMENTS.out.println();
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
//                allInOne.ASSIGNMENTS.out.print(" ");
//            }
//
//            // star
//            for (int star = 1; star <= row; star++){
//                allInOne.ASSIGNMENTS.out.print("* ");
//            }
//            allInOne.ASSIGNMENTS.out.println();
//        }
/////////////////////////////////////////////////////////////////////////////////
//        for (int row = 5; row>=1; row--){
//            for (int space = 5 ; space > 5-row; space--){
//                allInOne.ASSIGNMENTS.out.print("*");
//            }
//            allInOne.ASSIGNMENTS.out.println();
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
//                        allInOne.ASSIGNMENTS.out.print(" ");
//                    }
////                strars
//                    for(int col=1;col<=row;col++){
//                        allInOne.ASSIGNMENTS.out.print("* ");
//                    }
//                    allInOne.ASSIGNMENTS.out.println();
//                }
//
////                for outer loop
//                for(int row=n-1;row >=1;row--)
//                {
////            space
//                    for(int space=1;space<=n-row;space++)
//                    {
//                        allInOne.ASSIGNMENTS.out.print(" ");
//                    }
//                    for (int col=1;col<=row;col++)
//                    {
//                        allInOne.ASSIGNMENTS.out.print("* ");
//                    }
//
//                    allInOne.ASSIGNMENTS.out.println();
//                }

        //////////////////////////////////////////////////////////////////////
//        //MY DIAMOND
//
//        //FOR THE FIRST LOOP
//        int num = 3;
//        //SPACES
//        for (int row = 1; row <=num-row; row++) {
//            allInOne.ASSIGNMENTS.out.println("-");
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
                        allInOne.ASSIGNMENTS.out.print(" ");
                    }
                    for (int col=1;col<=row;col++)
                    {
                        allInOne.ASSIGNMENTS.out.print("* ");
                    }

                    allInOne.ASSIGNMENTS.out.println();

                }

                for(int row=2; row<=n;row++){

                    //space
                    for(int space=1;space<=n-row;space++)
                    {
                        allInOne.ASSIGNMENTS.out.print(" ");
                    }

//            star
                    for (int col=1;col<=row;col++)
                    {
                        allInOne.ASSIGNMENTS.out.print("* ");
                    }
                    allInOne.ASSIGNMENTS.out.println();

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
//                allInOne.ASSIGNMENTS.out.print(col%2==0? " 1 ": " 0 ");
//            }
//            allInOne.ASSIGNMENTS.out.println();
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
//            allInOne.ASSIGNMENTS.out.println("Enter a number --> ");
//            int num = sc.nextInt();
//            for (int i = 1 ; i <= num ; i++){
//                for (int j = 1 ; j <= i ; j++ ){
//                    allInOne.ASSIGNMENTS.out.print("*");
//                }
//                allInOne.ASSIGNMENTS.out.println(" ");
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
//                allInOne.ASSIGNMENTS.out.print("* ");
//            }
//            allInOne.ASSIGNMENTS.out.println();
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
//                allInOne.ASSIGNMENTS.out.print(row + " ");
//            }
//            allInOne.ASSIGNMENTS.out.println();
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
//                allInOne.ASSIGNMENTS.out.print(col + " ");
//            }
//            allInOne.ASSIGNMENTS.out.println();
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
//                allInOne.ASSIGNMENTS.out.print((col % 2 == 0 ? "0" : "1") + " ");
//            }
//            allInOne.ASSIGNMENTS.out.println();
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
//                allInOne.ASSIGNMENTS.out.print("* ");
//            }
//            allInOne.ASSIGNMENTS.out.println();
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
//                allInOne.ASSIGNMENTS.out.print(count+" ");
//            }
//            allInOne.ASSIGNMENTS.out.println();
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
//                allInOne.ASSIGNMENTS.out.print(col+" ");
//            }
//            allInOne.ASSIGNMENTS.out.println();
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
//            allInOne.ASSIGNMENTS.out.print(" ");
//        }
//        //star
//        for (int star = 1; star <=row ; star++) {
//            allInOne.ASSIGNMENTS.out.print("*");
//        }
//        allInOne.ASSIGNMENTS.out.println();
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
//            allInOne.ASSIGNMENTS.out.print(" ");
//        }
//        //values
//        for (int value = 1; value <=row ; value++) {
//            allInOne.ASSIGNMENTS.out.print(value);
//        }
//        allInOne.ASSIGNMENTS.out.println();
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
//            allInOne.ASSIGNMENTS.out.print(" ");
//        }
//        for (int value = 1; value <=row; value++) {
//            allInOne.ASSIGNMENTS.out.print("* ");
//        }
//        allInOne.ASSIGNMENTS.out.println();
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
//                    allInOne.ASSIGNMENTS.out.print(even % 2 == 0 ? "1" : "0");
//                }
//            } else {
//                for (int odd = 1; odd <= row; odd++) {
//                    allInOne.ASSIGNMENTS.out.print(odd % 2 == 0 ? "0" : "1");
//                }
//            }
//            allInOne.ASSIGNMENTS.out.println();
//        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}