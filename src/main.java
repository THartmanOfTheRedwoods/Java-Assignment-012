/**
 *
 * @author Trevor Hartman
 * @author Geng Cha
 *
 * @since Version 1.0
 *
 */
import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        int[] goatedArray = {5, 2, 9, 1, 5, 6};

        System.out.println("Eww... look at it: " + Arrays.toString(goatedArray));


        SortingAlgorithms.plsSort(goatedArray);
        System.out.println("LOOKS!!! ITS SORTED: " + Arrays.toString(goatedArray));

    }
}
