public class SortingAlgorithms {

    public void selectionSort(int[] arr) {
        int n = arr.length;
        // find the index of the minimum element in the unsorted portion
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap elements if the minimum element is not already at index i
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        SortingAlgorithms sorter = new SortingAlgorithms();
        int[] arr = { 64, 25, 12, 22, 11, 77, 43, 16, 52, 27, 99, 3, 45, 83 };
        sorter.selectionSort(arr);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}