package Code_With_harry.CodeWithHarry_Practice.Arrays;

public class reverse_TheArray {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int length = arr.length;
        int n = Math.floorDiv(length, 2);
        int temp ;

        for (int i = 0; i < n; i++) {

            temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;

        }

        for (int j = 0; j < length; j++) {
            System.out.print(arr[j] + " ");
            
        }



    }
}
