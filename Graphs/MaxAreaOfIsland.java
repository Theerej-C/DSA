import java.util.LinkedList;
import java.util.Queue;

public class MaxAreaOfIsland {
    public static class Pair {
        int fir;
        int sec;

        Pair(int fir, int sec) {
            this.fir = fir;
            this.sec = sec;
        }
    }

    public static int helper(int[][] ar) {
        int count = 0;
        int n = ar.length;
        int m = ar[0].length;
        int[][] vis = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ar[i][j] == 1 && vis[i][j] == 0) {
                    int count1 = 0;
                    dfs(i, j, ar, vis, count1);
                } else if (ar[i][j] == 0) {
                    vis[i][j] = 0;
                }

            }
        }
        return count;
    }

    private static void dfs(int i, int j, int[][] ar, int[][] vis, int count) {

        int n = ar.length;
        int m = ar[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        vis[i][j] = 1;
        while (!q.isEmpty()) {
            int r = q.peek().fir;
            int c = q.peek().sec;
            q.poll();
            if ((r > 0 && ar[r - 1][c] == 1) && vis[r - 1][c] == 0) {
                vis[r - 1][c] = 1;
                q.add(new Pair(r - 1, c));
                count++;

            }
            if ((r < n - 1 && ar[r + 1][c] == 1) && vis[r + 1][c] == 0) {
                vis[r + 1][c] = 1;
                q.add(new Pair(r + 1, c));
                count++;

            }
            if ((c > 0 && ar[r][c - 1] == 1) && vis[r][c - 1] == 0) {
                vis[r][c - 1] = 1;
                q.add(new Pair(r, c - 1));
                count++;

            }
            if ((c < m - 1 && ar[r][c + 1] == 1) && vis[r][c + 1] == 0) {
                vis[r][c + 1] = 1;
                q.add(new Pair(r, c + 1));
                count++;
            }
        }

    }

    public static void main(String[] args) {
        int[][] ar = {
                { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 }
        };
        System.out.println(helper(ar));

    }

}
