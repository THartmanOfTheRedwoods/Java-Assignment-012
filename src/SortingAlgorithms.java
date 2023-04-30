/**
 * @author Jason Carr
 * @author Trevor Hartman
 * @since v1.0
 */
public class SortingAlgorithms {
    public void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }


    }
    void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println( );
    }
    public static void main(String[] args) {
        SortingAlgorithms ob = new SortingAlgorithms();
        int[] arr = {78, 24, 67, 79, 43, 23};
        System.out.println("Unsorted Array");
        ob.printArray(arr);
        ob.selectionSort(arr);
        System.out.println("Sorted Array");
        ob.printArray(arr);
    }
    //Source: https://www.geeksforgeeks.org/selection-sort/# With modifications.

}
