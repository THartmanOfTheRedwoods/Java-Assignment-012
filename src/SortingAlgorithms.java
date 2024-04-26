// Written By: Austin Barnett
// Date: 4/26/2024
// Version 1.0

public class SortingAlgorithms {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }


            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {45, -2, 0, 11, -9, 88, -97, -202, 747};
        selectionSort(myArray);

        System.out.println("The array after sorting in ascending order by Selection Sort is:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
