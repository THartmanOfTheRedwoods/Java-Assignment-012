/**
 * @author Trevor Hartman
 * @author Linh Dinh
 *
 * @since version 1.0
 */
import java.util.Arrays;
public class SortingAlgorithms {
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int lowestIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[lowestIndex]) {
                    lowestIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[lowestIndex];
            arr[lowestIndex] = temp;
        }
        return arr;
    }
    public static void main(String[]args){
        int[] a ={3,9,6,2,5,4,1,7,8};
        int[] b ={12,19,28,13,45,23,87,56,40};
        System.out.println(Arrays.toString(selectionSort(a)));
        System.out.println(Arrays.toString(selectionSort(b)));
    }
}