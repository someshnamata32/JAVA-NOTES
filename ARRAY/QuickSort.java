import java.util.*;

public class Main {

    public static int partition(int[] arr, int st, int end) {
        int pivot = arr[end];
        int idx = st - 1;

        for (int j = st; j < end; j++) {
            if (arr[j] <= pivot) {
                idx++;
                
                // swap arr[j] and arr[idx]
                int temp = arr[j];
                arr[j] = arr[idx];
                arr[idx] = temp;
            }
        }

        idx++;
        
        // swap pivot to correct position
        int temp = arr[end];
        arr[end] = arr[idx];
        arr[idx] = temp;

        return idx;
    }

    public static void quickSort(int[] arr, int st, int end) {
        if (st < end) {
            int pivIdx = partition(arr, st, end);

            quickSort(arr, st, pivIdx - 1);   // left half
            quickSort(arr, pivIdx + 1, end); // right half
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 4, 1, 3};

        quickSort(arr, 0, arr.length - 1);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
