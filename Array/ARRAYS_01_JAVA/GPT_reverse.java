package Array.ARRAYS_01_JAVA;

public class GPT_reverse {

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap the elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move the pointers towards the middle
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6};

        // Print original array
        System.out.print("Original array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Reverse the array
        reverseArray(array);

        // Print reversed array
        System.out.print("Reversed array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
