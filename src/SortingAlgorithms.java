import java.util.Arrays;
public class SortingAlgorithms {


    public static void selectionSort(int[] sort) {

        //continues the loop until it reaches the final element
        for (int j = 0; j < sort.length-1 ; j++) {
            int index=j;

            //checks each element in the array for the lowest value and assigns the  index of that
            //value to index
            for (int i = j+1; i < sort.length; i++) {
                if (sort[i] < sort[index]) {
                    index = i;
                }
            }
                    int swap= sort[index];//lowest value
                    sort[index]= sort[j];//assigns the lower value to the element in j
                    sort[j]=swap; // assigns the leftmost value to the lower value

        }
        System.out.println(Arrays.toString(sort));
    }

    public static void main(String[] args) {
        int[] test ={103,2,0,125,81};
        selectionSort(test);

    }
}
