
import java.util.Random;

public class QuickSort {

    public static void quickSort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }
        int randPivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;

        int pivot = arr[randPivotIndex];
        swap(arr, randPivotIndex, highIndex);
        int leftPointer = getLeftPointer(arr, lowIndex, highIndex, pivot);

        quickSort(arr, lowIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIndex);
    }

    private static int getLeftPointer(int[] arr, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int RightPointer = highIndex;

        while (leftPointer < RightPointer) {
            while (arr[leftPointer] <= pivot && leftPointer < RightPointer) {
                leftPointer++;
            }
            while (arr[RightPointer] > pivot && leftPointer < RightPointer) {
                RightPointer--;
            }
            swap(arr, leftPointer, RightPointer);
        }
        swap(arr, leftPointer, highIndex);
        return leftPointer;
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) {

        int[] arr = { 3, 6, 3, 2, 5, 6 };
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
