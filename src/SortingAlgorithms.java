public class SortingAlgorithms {
    public static void selectionSort(int[] arr) {
        int a = arr.length;
        for (int i = 0; i < a-1; i++) {
            int min = i;
            for (int b = i+1; b < a; b++) {
                if (arr[b] < arr[min]) {
                    min = b;
                }
            }

            int first = arr[min];
            arr[min] = arr[i];
            arr[i] = first;
        }
    }

    public static void main(String[] args) {
        int[] arr = {48, 24, 12, 60, 36};
        selectionSort(arr);
        System.out.println("Sorted array is:");
        for (int i : arr) {
            System.out.println(" " + i);
        }
    }
}
