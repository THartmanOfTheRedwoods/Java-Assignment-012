import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithms {

    static int[] array = new int[10];

    // makes a new random array each time, for funsies
    public static int[] fillArray() {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1;
        }
        return array;
    }

    public void selectionSort(int[] array) {
        int timesSorted = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                    // so you can see the whole process
                    timesSorted++;
                    System.out.printf("Sorting round %d: \t %s %n", timesSorted, Arrays.toString(array));
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        // got carried away with this, but considering this is my last assignment, my as well have some fun
        if (timesSorted <= 10) {System.out.println("Light work.");}
        if (timesSorted > 11 && timesSorted < 15) {System.out.println("Decently challenging.");}
        if (timesSorted >= 15) {System.out.println("Damn, that was tedious.");}
    }

    public static void main(String[] args) {
        SortingAlgorithms sorter = new SortingAlgorithms();
        int[] example = fillArray();

        System.out.printf("Unsorted Array: \t %s %n", Arrays.toString(example));
        sorter.selectionSort(example);
        System.out.printf("Sorted Array:   \t %s %n", Arrays.toString(example));
    }
}
