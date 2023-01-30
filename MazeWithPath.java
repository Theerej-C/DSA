import java.util.Arrays;

public class MazeWithPath {

    public static void AllWays(String p, int[][] ar, int r, int c, int[][] path, int step) {
        if (r == ar.length - 1 && c == ar[0].length - 1) {
            path[r][c] = step;
            for (int[] is : path) {
                System.out.println(Arrays.toString(is));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (ar[r][c] == 1) {
            return;
        }
        ar[r][c] = 1;
        path[r][c] = step;
        // ArrayList<String> list = new ArrayList<>();
        if (r < ar.length - 1) {
            AllWays(p + "D", ar, r + 1, c, path, step + 1);
        }
        if (c < ar[0].length - 1) {
            AllWays(p + "R", ar, r, c + 1, path, step + 1);
        }
        if (r > 0) {
            AllWays(p + "U", ar, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            AllWays(p + "L", ar, r, c - 1, path, step + 1);
        }

        path[r][c] = 0;
        ar[r][c] = 0;
    }

    public static void main(String[] args) {
        int[][] ar = {
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 },
        };
        // waysWithObs("", ar, 0, 0);
        int[][] path = new int[ar.length][ar[0].length];
        AllWays("", ar, 0, 0, path, 1);
    }
}
