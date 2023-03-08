import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegion {

    static class Pair {
        int fir;
        int sec;

        Pair(int fir, int sec) {
            this.fir = fir;
            this.sec = sec;
        }
    }

    public static void helper(char[][] ar) {
        int n = ar.length;
        int m = ar[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == 0 || j == 0 || i == n - 1 || j == m - 1) && ar[i][j] == 'O') {
                    bfs(i, j, ar);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ar[i][j] == 'O') {
                    ar[i][j] = 'X';
                } else if (ar[i][j] == 'S') {
                    ar[i][j] = 'O';
                }
            }
        }
    }

    private static void bfs(int i, int j, char[][] ar) {
        int n = ar.length;
        int m = ar[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        ar[i][j] = 'S';
        while (!q.isEmpty()) {
            int r = q.peek().fir;
            int c = q.peek().sec;
            q.poll();
            if (r > 0 && ar[r - 1][c] == 'O') {
                ar[r - 1][c] = 'S';
                q.add(new Pair(r - 1, c));
            }
            if (r < n - 1 && ar[r + 1][c] == 'O') {
                ar[r + 1][c] = 'S';
                q.add(new Pair(r + 1, c));
            }
            if (c > 0 && ar[r][c - 1] == 'O') {
                ar[r][c - 1] = 'S';
                q.add(new Pair(r, c - 1));
            }
            if (c < m - 1 && ar[r][c + 1] == 'O') {
                ar[r][c + 1] = 'S';
                q.add(new Pair(r, c + 1));
            }
        }

    }

    public static void main(String[] args) {
        char[][] ar = {
                { 'O', 'X', 'X', 'X' },
                { 'O', 'X', 'O', 'X' },
                { 'X', 'O', 'X', 'X' },
                { 'X', 'O', 'X', 'X' },
        };
        helper(ar);
        for (char[] c : ar) {
            for (char a : c) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
