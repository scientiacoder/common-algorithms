package sort;
import static sort.Utils.swap;
import static sort.Utils.printArr;

public class SelectionSort {

    public static void selectionSort(int arr[]){
        int min, index;

        for (int i = 0; i < arr.length; i++) {
            min = Integer.MAX_VALUE;
            index = -1;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < min){
                    min = arr[j];
                    index = j;
                }
            }
            swap(arr, i, index);
        }

    }


    public static void main(String[] args) {
        int[] arr = new int[]{3,2,6,1,7,4,5};
        printArr(arr, arr.length);
        selectionSort(arr);
        printArr(arr, arr.length);

    }
}
