package leetcode;

public class NumberofClosedIslands {
    public static int helper(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0) {
                    if(dfs(mat, i, j)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static boolean dfs(int[][] mat,int i,int j){
//        vis[i][j] = true;
        int n = mat.length;
        int m = mat[0].length;
        if((i<0||j<0||i==n||j==m)){
            return false;
        }
        if(mat[i][j]==1){
            return true;
        }
        mat[i][j] = 1;
        boolean a = dfs(mat,i+1,j);
        boolean b = dfs(mat,i,j+1);
        boolean c = dfs(mat,i-1,j);
        boolean d = dfs(mat, i, j - 1);
        return a&&b&&c&&d;
    }


    public static void main(String[] args) {
        int[][] mat = {
                {1,1,1,1,1,1,1,0},
                {1,0,0,0,0,1,1,0},
                {1,0,1,0,1,1,1,0},
                {1,0,0,0,0,1,0,1},
                {1,1,1,1c,1,1,1,0}
        };
        System.out.println(helper(mat));
    }
}
