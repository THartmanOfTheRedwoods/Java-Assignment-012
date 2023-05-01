public class SortingAlgorithms {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        selectionSort(numbers);
        System.out.println("\nSorted array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
