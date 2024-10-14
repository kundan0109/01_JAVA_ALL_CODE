package Array.ARRAYS_01_JAVA;

//MULTIDIMENSIONAL ARRAY --> array of arrays
// every item of array is also an array
public class array03 {
    public static void main(String[] args) {

        /*int[] arr = {1, 2, 3, 4, 5};       // 1-D array


        int[][] str = new int[2][3];//  2D array
        str[0][0] = 101;
        str[0][1] = 102;
        str[0][2] = 103;
        str[1][0] = 201;
        str[1][1] = 202;
        str[1][2] = 203;

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j <= str.length; j++) {
                System.out.print(str[i][j]+ " ");
            }

            System.out.println();
        }*/

        //3D array

        int [][][] flats = new int[2][2][2];
        flats[0][0][0] = 101;
        flats[0][0][1] = 102;
        flats[0][1][0] = 103;
        flats[0][1][1] = 104;
        flats[1][0][0] = 201;
        flats[1][0][1] = 202;
        flats[1][1][0] = 203;
        flats[1][1][1] = 204;

        for (int i = 0; i < flats.length; i++) {

//            for (int j = 0; j < flats[i].length; j++)

            for (int j = 0; j < flats.length; j++) {

//                for (int k = 0; k < flats[j].length; k++)

                for (int k = 0; k < flats.length; k++) {
                    System.out.print(flats[i][j][k] + " ");
                }
            }
            System.out.println();
        }

    }


}
