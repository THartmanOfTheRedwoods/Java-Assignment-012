public class SortingAlgorithms {
    void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
            }
        }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
    }
}
void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i) {
        System.out.println(arr[i] + " ");
    }
    System.out.println();
}
public static void main(String args[]) {
        SortingAlgorithms sorter = new SortingAlgorithms();
        int arr[] = {4, 60, 4540, 30, 148};
        sorter.selectionSort(arr);
        System.out.println("Sorted array: ");
        sorter.printArray(arr);
}
}