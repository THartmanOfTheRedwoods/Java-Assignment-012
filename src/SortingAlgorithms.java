public class SortingAlgorithms {
    public static int[] selectionSort(int[] sortee) {
        int prevFirstPos;
        int newLowest;
        int oldIndex = 100;
        int I;
        for (int i = 0; i < sortee.length - 1; i++) {
            newLowest = sortee[i];
            for (I = i; I < sortee.length - 1; I++) {
                if(sortee[I]<newLowest){newLowest = sortee[I];
                    oldIndex = I;
                }
            }
            prevFirstPos = sortee[i];
            sortee[i] = newLowest;
            sortee[oldIndex] = prevFirstPos;
        }
        return sortee;

    }
}
