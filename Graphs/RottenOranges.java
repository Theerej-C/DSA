import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    public static class Orange {
        int row;
        int col;
        int time;

        public Orange(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public static int rottenOrenge(int[][] ar) {

        int tm = 0;
        int r = ar.length;
        int c = ar[0].length;
        int totCount = 0;
        Queue<Orange> q = new LinkedList<>();
        int[][] vis = new int[r][c];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                if (ar[i][j] == 2) {
                    q.add(new Orange(i, j, 0));
                    vis[i][j] = 2;
                } else {
                    vis[i][j] = 0;
                }
                if (ar[i][j] == 1) {
                    totCount++;
                }
            }
        }
        int[] rww = { -1, 0, 1, 0 };
        int[] cww = { 0, 1, 0, -1 };
        int count = 0;
        while (!q.isEmpty()) {
            int nrow = q.peek().row;
            int ncol = q.peek().col;
            int t = q.peek().time;
            tm = Math.max(t,tm);
            q.poll();
            for (int i = 0; i < 4; i++) {
                int rows = nrow + rww[i];
                int cols = ncol + cww[i];
                if (rows >= 0 && rows < r && cols >= 0 && cols < c && vis[rows][cols] == 0 && ar[rows][cols] == 1) {
                    q.add(new Orange(rows, cols, t+1));
                    vis[rows][cols] = 2;
                    count++;
                }

            }
        }
        if(totCount!=count) return -1;

        return tm;
    }

    public static void main(String[] args) {
        int[][] ar = {
            {2,1,1},
            {1,1,0},
            {0,1,1}
        };
        System.out.println(rottenOrenge(ar));
    }
}