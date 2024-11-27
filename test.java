import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class test {
    public static void main(String[] args){
       List<String> list = new ArrayList<>();
        list.add("DOWN");
       list.add("RIGHT");
        list.add("UP");
       int i = finalPositionOfSnake(2,  list);
        System.out.println(i);
    }
    public static int finalPositionOfSnake(int n, List<String> commands){
        int i=0,j=0,k=0;
        for(k = 0; k < commands.size(); k++){
            if(Objects.equals(commands.get(k), "UP"))
                i--;
            else if(Objects.equals(commands.get(k), "RIGHT"))
                j++;
            else if(Objects.equals(commands.get(k), "DOWN"))
                i++;
            else if(Objects.equals(commands.get(k), "LEFT"))
                j--;
        }
        return (i * n) + j;
    }
}



/*
 public class HeapSort {

    // Method to perform heap sort and count zeros
    public static int heapSort(int[] nums) {
        int n = nums.length;
        int zeroCount = 0;

        // Count zeros in the array before sorting
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            }
        }

        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            swap(nums, 0, i);

            // Call max heapify on the reduced heap
            heapify(nums, i, 0);
        }

        // Return the count of zeros
        return zeroCount;
    }

    // Method to maintain the max-heap property
    private static void heapify(int[] nums, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left < n && nums[left] > nums[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && nums[right] > nums[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            swap(nums, i, largest);

            // Recursively heapify the affected sub-tree
            heapify(nums, n, largest);
        }
    }

    // Method to swap two elements in the array
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Main method for testing the heap sort algorithm
    public static void main(String[] args) {
        int[] nums = {12, 0, 13, 5, 0, 7};
        System.out.println("Original array:");
        printArray(nums);

        int zeroCount = heapSort(nums);

        System.out.println("Sorted array:");
        printArray(nums);

        System.out.println("Number of zeros: " + zeroCount);
    }

    // Method to print the array
    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

*/
