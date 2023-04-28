/**
 * @author Trevor Hartman
 * @author Rachelle Iloff
 * created 4/28/2023
 * @since version 1.0
 */


//Implement in class **SortingAlgorithms** a method called **selectionSort**
// that can sort an integer array utilizing the **Selection Sort** algorithm.
public class SortingAlgorithms {
    void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }

        }
        void printArray(int[] arr){
            for (int j : arr) System.out.print(j + " ");
    }
        public static void main(String[] args){
            SortingAlgorithms ob = new SortingAlgorithms();
            int[] arr = {100,75,12,22,105};
            ob.selectionSort(arr);
            System.out.println("Sorted array:");
            ob.printArray(arr);
    }
}
