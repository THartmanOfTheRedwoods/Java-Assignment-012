import java.util.Random;
public class SortingAlgorithms {

    public static int[] selectionSorter(int[] arr) {
        int placeholder1 = 0;
        int placeholder2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    placeholder1 = arr[i];
                    placeholder2=arr[j];
                    arr[i] = placeholder2;
                    arr[j] = placeholder1;
                }

            }
        }
        return arr;

    }

    public static void main(String[] args) {
        Random rand = new Random();

        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = rand.nextInt(10);
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        ints= selectionSorter(ints);
        System.out.println("sorted");
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }
}
