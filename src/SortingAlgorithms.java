public class SortingAlgorithms {
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int[] sortedArr = SortingAlgorithms.selectionSort(arr);
        System.out.print("Sorted array: ");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }

}

