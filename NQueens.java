public class NQueens {

    public static int queens(int[][] ar, int row) {
        if (row == ar.length) {
            display(ar);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < ar.length; col++) {
            if (isQueen(ar, row, col)) {
                ar[row][col] = 1;
                count += queens(ar, row + 1);
                ar[row][col] = 0;
            }
        }
        return count;
    }

    private static boolean isQueen(int[][] ar, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (ar[i][col] == 1) {
                return false;
            }
        }
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (ar[row - i][col - i] == 1) {
                return false;
            }
        }
        int maxRight = Math.min(row, ar.length - col - 1);

        for (int i = 1; i <= maxRight; i++) {
            if (ar[row - i][col + i] == 1) {
                return false;
            }
        }
        return true;
    }

    private static void display(int[][] ar) {
        for (int[] a : ar) {
            for (int i : a) {
                if (i == 0) {
                    System.out.print("N ");
                } else {
                    System.out.print("Q ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] ar = new int[4][4];
        System.out.println(queens(ar, 0));
    }
}
