package Array.ARRAYS_01_JAVA;

//  REVERSE AN ARRAY

public class practice05 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int l = array.length;
        int n = l / 2;
        int temp;

        for (int i = 0; i < n; i++) {
            temp = array[i];
            array[i] = array[l - 1 - i];
            array[l - 1 - i] = temp;
        }

        for (int ek : array){
            System.out.print(ek + " ");
        }






    }
}
