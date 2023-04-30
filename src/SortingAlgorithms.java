import java.sql.Array;

public class SortingAlgorithms {

    public static void selectionSort(int[] unsortArray) {
        int n = unsortArray.length;
    for (int i = 0; i < n - 1; i++){
        int minIndex = i;
        for (int j = i + 1; j < n; j++){
            if (unsortArray[j] < unsortArray[minIndex]){
                minIndex = j;
            }
        }
        // swap
        int temp = unsortArray[minIndex];
        unsortArray[minIndex] = unsortArray[i];
        unsortArray[i] = temp;
        }
    }

    public static void main(String args[]) {
        int[] testArray = new int[]{8, 12, 14, 15, 11, 13, 5, 25, 19, 100};
        selectionSort(testArray);
        for (int i = 0; i < testArray.length; i++){
            System.out.print((testArray[i] + " "));
            System.out.println();
        }
    }
}




