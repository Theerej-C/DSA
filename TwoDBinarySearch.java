
import java.util.Arrays;

public class TwoDBinarySearch {

    public static void main(String[] args) {

        int[][] ar = {
                { 10, 20, 30 },
                { 25, 35, 45 },
                { 35, 45, 55 }
        };
        System.out.println(Arrays.toString(twoDBinarySearch(ar, 55)));
    }

    public static int[] twoDBinarySearch(int[][] arr, int target) {

        int row = 0;
        int column = arr[0].length - 1;
        while (row < arr.length && column >= 0) {
            if (arr[row][column] == target) {
                return new int[] { row, column };
            } else if (arr[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }

        return new int[] { -1, -1 };
    }
}
