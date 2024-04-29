public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 5, 9, 2, 4, 8, 7, 10};
        SortingAlgorithms.selectionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(arr, i, minIndex);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}