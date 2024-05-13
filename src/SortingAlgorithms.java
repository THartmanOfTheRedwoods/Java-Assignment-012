import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{4, 2, 1, 3, 5, 7, 6, 8, 9, 10};
        System.out.println(STR."Unsorted: \{Arrays.toString(arr)}");
        selectionSort(arr);
        System.out.println(STR."Sorted: \{Arrays.toString(arr)}");
    }

    public static void selectionSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
