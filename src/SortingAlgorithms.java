/**
 * @author Trevor Hartman
 * @author Alexei Iachkov
 * @date 4-27-24
 * @version 1.0
 */
import java.util.Arrays;

public class SortingAlgorithms {
    private int[] array;

    // Constructor to initialize the SortingAlgorithms class with an integer array
    public SortingAlgorithms(int[] array) {
        this.array = array;
    }

    // Method to perform Selection Sort on the integer array
    public void selectionSort() {
        System.out.println("Sorting the array using Selection Sort:");
        System.out.println("Initial Array: " + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the unsorted portion of the array
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the current element
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }

            // Print the array after each iteration
            System.out.println("After Iteration " + (i + 1) + ": " + Arrays.toString(array));
        }

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    // Main method to test the selectionSort method
    public static void main(String[] args) {
        int[] arrayToSort = {65, 225, 11, 35, 12, 20, 110};
        SortingAlgorithms sorter = new SortingAlgorithms(arrayToSort);
        sorter.selectionSort();
    }
}