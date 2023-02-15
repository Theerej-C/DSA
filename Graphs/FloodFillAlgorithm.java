public class FloodFillAlgorithm {

    public static void dfs(int[][] ar, int[][] ans, int row, int col, int iniCol, int finalCol) {
        ans[row][col] = finalCol;
        int n = ar.length;
        int m = ar[0].length;
        if (row < n - 1 && ar[row + 1][col] == iniCol && ans[row + 1][col] != finalCol) {
            dfs(ar, ans, row + 1, col, iniCol, finalCol);
        }
        if (row > 0 && ar[row - 1][col] == iniCol && ans[row - 1][col] != finalCol) {
            dfs(ar, ans, row - 1, col, iniCol, finalCol);
        }
        if (col < m - 1 && ar[row][col + 1] == iniCol && ans[row][col + 1] != finalCol) {
            dfs(ar, ans, row, col + 1, iniCol, finalCol);
        }
        if (col > 0 && ar[row][col-1] == iniCol && ans[row][col - 1] != finalCol) {
            dfs(ar, ans, row, col - 1, iniCol, finalCol);
        }
    }

    public static void main(String[] args) {
        int[][] ar = {
                { 1, 1, 1 },
                { 1, 1, 0 },
                { 1, 0, 1 }
        };
        int[][] ans = ar;
        dfs(ar, ans, 1, 1, 1, 2);
        for(int[] i:ans){
            for(int a:i){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
