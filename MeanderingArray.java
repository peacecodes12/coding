import java.util.Arrays;

public class MeanderingArray {

    // Function to create the meandering array in constant space
    public static void makeZigzagArray(int[] arr) {
        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Use two pointers
        int left = 0;          // Pointer for the smallest element
        int right = arr.length - 1;  // Pointer for the largest element

        // Step 3: Rearrange elements in place
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                // Even indices get the largest remaining element
                arr[i] = arr[right];
                right--;
            } else {
                // Odd indices get the smallest remaining element
                arr[i] = arr[left];
                left++;
            }
        }
    }

    // Helper function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test the function with a sample array
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("Original array:");
        printArray(arr);

        // Create the meandering array in place
        makeZigzagArray(arr);

        System.out.println("Meandering array:");
        printArray(arr);
    }
}
