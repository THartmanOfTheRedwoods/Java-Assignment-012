/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */

import java.util.Arrays;
import java.util.Random;
public class SortingAlgorithms {


    public static int[] numbers = new int[100]; // new array that can hold 99 entries

    public static int[] randomNumbers() { // Method for generating an array of random numbers

        Random randomGen = new Random(); // Creates random num gen object
        for (int i = 0; i < numbers.length; i ++) {
            numbers[i] = randomGen.nextInt(100); // Generates random numbers
        } return numbers;

    }

    public static void selectionSort() {

        // i must be less than the total length of array numbers
        for (int i = 0; i < numbers.length - 1; i ++) {

            int minElmIndex = i; // creates a place to temporarily store elements for swapping

            // j is equal to i + 1 (the next element after i)
            for (int j = i + 1; j < numbers.length; j ++) {

                // If numbers array at position i (in minElmIndex) is greater than position j, move position j (swap) to i
                // Basically moves the smaller index object to the left
                if (numbers[minElmIndex] > numbers[j]) {

                    minElmIndex = j;

                }

            }

            // If j is not equal to i, move j to spot i
            // This part does the actual moving of elements
            if (minElmIndex != i) {

                int temp = numbers[i];

                numbers[i] = numbers[minElmIndex];

                numbers[minElmIndex] = temp;

            }

        }


    }

    public static void print() { // Method for printing contents of array

        System.out.println(Arrays.toString(numbers));

    }

    public static void main(String[] args) {

        randomNumbers();

        System.out.println("The initial random unsorted array is: ");
        print();
        System.out.println();

        selectionSort();

        System.out.println("The sorted array is: ");
        print();


    }

}
