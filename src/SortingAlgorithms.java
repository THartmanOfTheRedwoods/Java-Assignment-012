import java.util.Arrays;

public class SortingAlgorithms {
    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        SortingAlgorithms sorter = new SortingAlgorithms();
        int[] arr = {89, 2, 15, 60, 123};
        sorter.selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
