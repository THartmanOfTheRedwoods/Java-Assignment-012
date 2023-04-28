/**
 * @author MK Ripley
 * @since Version 1.0
 * 4/28/2023
 */
public class SortingAlgorithms {
    public static void sort(int[] a){
        for (int i = 0; i < a.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < a.length; j++){
                if (a[j] < a[index]){
                    index = j;
                }
            }
            int min = a[index];
            a[index] = a[i];
            a[i] = min;
        }
    }

    public static void main(String[] a){
        int[] numbers = {6,4,54,51,7,9,3}; //put numbers to sort here
        System.out.println("Input:");
        for(int i:numbers){
            System.out.print(i + " ");
        }
        System.out.println("\nSorted:");
        sort(numbers);
        for(int i:numbers){
            System.out.print(i + " ");
        }
    }
}
