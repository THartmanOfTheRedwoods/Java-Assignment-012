public class SortingAlgorithms {
    public void selectionSort(int[] arr) {  // I read that arr is a commonly used abbreviation for array.
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // minimum element index
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // This is to swap the smallest element with the first element of the unsorted subdeck.
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
