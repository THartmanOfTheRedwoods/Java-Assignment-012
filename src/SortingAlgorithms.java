public class SortingAlgorithms {
    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minIndx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndx]) {
                    minIndx = j;
                }
            }
            int temp = array[minIndx];
            array[minIndx] = array[i];
            array[i] = temp;
        }
    }
    public static void printArr(int[] array){
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {5, 3, 10, 2, 1, 4, 6, 8, 7, 9};
        System.out.print("Unsorted: ");
        printArr(array);

        selectionSort(array);
        System.out.print("Sorted: ");
        printArr(array);

    }
}
