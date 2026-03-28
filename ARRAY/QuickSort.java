class QuickSort {

    int partition(int arr[], int low, int high) {
        int pivot = arr[high];  // last element pivot
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);  // left
            quickSort(arr, pi + 1, high); // right
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};

        QuickSort obj = new QuickSort();
        obj.quickSort(arr, 0, arr.length - 1);

        for(int val : arr) {
            System.out.print(val + " ");
        }
    }
}
