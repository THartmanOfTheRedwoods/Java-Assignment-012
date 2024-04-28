public class SortingAlgorithms {
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {6, 5, 2, 7, 1, 50000, 44, 314, 263589, 39, 29642};
        int[] sorted_arr = SortingAlgorithms.selectionSort(arr);

        System.out.print("Sorted array is: ");
        for (int num : sorted_arr) {
            System.out.print(num + " ");
        }
    }
}



