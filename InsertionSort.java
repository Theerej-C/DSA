
public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    public static void main(String[] args) {

        int[] array = { 3, 5, 3, 2, 4, 7, 5, 4 };
        insertionSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
