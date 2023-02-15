import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

    public static class Pair {
        public int fir;
        public int sec;

        Pair(int fir, int sec) {
            this.fir = fir;
            this.sec = sec;
        }
    }

    public static int helper(char[][] ar) {
        int count = 0;
        int n = ar.length;
        int m = ar[0].length;
        int[][] vis = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ar[i][j] == '1' && vis[i][j] == 0) {
                    count++;
                    bfs(i, j, vis, ar);
                }
            }
        }
        return count;

    }

    private static void bfs(int i, int j, int[][] vis, char[][] ar) {
        int n = ar.length;
        int m = ar[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        vis[i][j] = 1;
        while (!q.isEmpty()) {
            int r = q.peek().fir;
            int c = q.peek().sec;
            q.poll();
            if ((r > 0 && ar[r - 1][c] == '1') && vis[r - 1][c] == 0) {
                vis[r - 1][c] = 1;
                q.add(new Pair(r - 1, c));
            }
            if ((r < n - 1 && ar[r + 1][c] == '1') && vis[r + 1][c] == 0) {
                vis[r + 1][c] = 1;
                q.add(new Pair(r + 1, c));
            }
            if ((c > 0 && ar[r][c - 1] == '1') && vis[r][c - 1] == 0) {
                vis[r][c - 1] = 1;
                q.add(new Pair(r, c - 1));
            }
            if ((c < m - 1 && ar[r][c + 1] == '1') && vis[r][c + 1] == 0) {
                vis[r][c + 1] = 1;
                q.add(new Pair(r, c + 1));
            }
        }
    }

    public static void main(String[] args) {
        char[][] ar = {
                { '0', '0', '0', '0', '0' },
                { '1', '1', '0', '1', '0' },
                { '0', '0', '1', '0', '0' },
                { '0', '0', '0', '1', '1' },
        };
        System.out.println(helper(ar));
    }
}
