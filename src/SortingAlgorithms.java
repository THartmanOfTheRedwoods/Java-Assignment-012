/*
Utilized GeeksforGeeks for this code, which displayed Rajat Mishra's code.
I cant say I can take full credit for this code, but I adjusted it to take the instance variable array
and rewrote some of the weird formatting.
@Aaron2023
 */
public class SortingAlgorithms {
    private final int[] array= {15,92,83,74,45,6};

    void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int minIdx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        SortingAlgorithms ob = new SortingAlgorithms();
        ob.sort(ob.array);
        System.out.println("Here's your sorted array");
        ob.printArray(ob.array);
    }
}
