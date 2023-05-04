import java.util.Scanner;
public class SortingAlgorithms {
    public static void Sort(int[] arr) {
        int n = arr.length;
        boolean S;
        for (int i = 0; i < n - 1; i++) {
            S = false;
            for (int a = 0; a < n - i - 1; a++) {
                if (arr[a] > arr[a + 1]) {
                    int t = arr[a];
                    arr[a] = arr[a + 1];
                    arr[a + 1] = t;
                    S = true;
                }
            }
            if (!S) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        Sort(arr);
        System.out.println("Sorted array: ");
        System.out.println(arr[0]);
        for (int i = 1; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
