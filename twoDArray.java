import java.util.Arrays;
import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[][] arr = new int[3][3];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    /*
                     * here j index is arr[x] because for every row the column number
                     * varies so take this
                     * 
                     */
                    arr[i][j] = in.nextInt();
                }
            }

            for (int[] ints : arr) {

                for (int anInt : ints) {

                    System.out.print(anInt + " ");
                }
                System.out.println();// this line is to add space and new line for rows

            }
            for (int[] i : arr) {
                System.out.println(Arrays.toString(i));
            }
            // This enhanced for loop refers t every element of the array
            // As this array contains array as an element so the datatype is array
            //
        }
    }
}
