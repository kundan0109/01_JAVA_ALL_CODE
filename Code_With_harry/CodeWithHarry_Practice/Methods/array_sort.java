package Code_With_harry.CodeWithHarry_Practice.Methods;

import java.util.Arrays;

public class array_sort {
    public static void main(String[] args) {
        // Example array
        int[] array = {5, 3, 8, 4, 2, 7, 1, 10, 6, 9};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Sort the array
        Arrays.sort(array);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
