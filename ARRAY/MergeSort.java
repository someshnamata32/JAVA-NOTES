class MergeSort {

    void merge(int arr[], int st, int mid, int end) {
        int temp[] = new int[end - st + 1];

        int i = st, j = mid + 1, k = 0;

        while(i <= mid && j <= end) {
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        while(j <= end) {
            temp[k++] = arr[j++];
        }

        // copy back
        for(i = st, k = 0; i <= end; i++, k++) {
            arr[i] = temp[k];
        }
    }

    void mergeSort(int arr[], int st, int end) {
        if(st < end) {
            int mid = st + (end - st) / 2;

            mergeSort(arr, st, mid);      // left
            mergeSort(arr, mid + 1, end); // right

            merge(arr, st, mid, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 31, 35, 8, 32, 17};

        MergeSort obj = new MergeSort();
        obj.mergeSort(arr, 0, arr.length - 1);

        for(int val : arr) {
            System.out.print(val + " ");
        }
    }
}
