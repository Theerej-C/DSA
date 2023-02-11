public class NumberOfProvinces {
    
    public static void main(String[] args) {
        int[][] ar = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(findCircleNum(ar));
    }


    public static int findCircleNum(int[][] c) {
    boolean[] vis = new boolean[c.length];
    int count = 0;
    for(int i=0;i<c.length;i++){
        if(!vis[i]){
            count++;
            dfs(c,i,vis);
        }
    }
    return count;

    }
    public static void dfs(int[][] c,int i,boolean[] vis){
        vis[i] = true;
        for(int j=0;j<c.length;j++){
            if(!vis[j]&&c[i][j]==1){
                dfs(c,j,vis);
            }
        }
    }
}
