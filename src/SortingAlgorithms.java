import java.util.Arrays;

public class SortingAlgorithms {

    // find the lowest card between low and high
    // Unneeded code?, remove private int indexLowest(int low, int high) {}

    //public static void main(String[] args) {
      //  SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();

        //int[] a = {64, 25, 12, 22, 11};
        //sortingAlgorithms.selectionSort(a);

        //System.out.println("Sorted array: " + Arrays.toString(a));
    //}




    public void selectionSort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            // find the lowest card at or to the right of i
            int indexLowest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[indexLowest]) {
                    indexLowest = j;
                }
            }

            // swap the ith card and the lowest card found
            if (i != indexLowest) {
                int temp = a[i];
                a[i] = a[indexLowest];
                a[indexLowest] = temp;
            }
        }
    }
}
