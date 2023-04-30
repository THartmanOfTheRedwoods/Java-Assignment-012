import java.util.Arrays;

public class SortingAlgorithms {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int lowNum = i;
            for (int l = i + 1; l < arr.length; l++) {
                if (arr[l] < arr[lowNum]) {
                    lowNum = l;
                }
            }
            int temp = arr[lowNum];
            arr[lowNum] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 4, 7, 9, 2, 6, 1, 3};
        System.out.println("Unsorted: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}