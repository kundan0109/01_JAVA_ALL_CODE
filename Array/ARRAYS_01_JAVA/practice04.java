package Array.ARRAYS_01_JAVA;

public class practice04 {
    public static void main(String[] args) {

        //0 04 ADDITION OF TWO array matrix

        int [][] matrix01 = {{5, 6, 8},
                            {4, 5, 6}};

        int [][] matrix02 = {{5, 6, 8},
                            {4, 5, 6}};


        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int i = 0; i < matrix01.length; i++) {
            for (int j = 0; j < matrix02[i].length; j++) {
                result[i][j] = matrix01[i][j] + matrix02[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }


    }
}
