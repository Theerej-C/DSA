public class MergeSort {

    public static void mergeSort(int[] array) {
        int N = array.length;
        if (N < 2) {
            return;
        }
        int mid = N / 2;
        int[] left = new int[mid];
        int[] right = new int[N - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < N; i++) {
            right[i - mid] = array[i];
        }
        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }

    public static void merge(int[] array, int[] left, int[] right) {

        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] ar = { 2, 6, 7, 4, 5, 9, 3, 65, 87, 45, 3, 2, 8, 0 };
        System.out.println("Before: ");
        for (int i : ar) {
            System.out.println(i);
        }
        System.out.println("After: ");
        mergeSort(ar);
        for (int i : ar) {
            System.out.println(i);
        }
    }
}
