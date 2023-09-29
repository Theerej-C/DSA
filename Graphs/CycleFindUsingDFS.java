import java.util.ArrayList;

public class CycleFindUsingDFS {
    private boolean dfs(int node, int parent,int[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        for(int no:adj.get(node)){
            if(vis[no]==0){
                if(dfs(no,node,vis,adj)){
                    return true;
                }
            }
            else if(no!=parent){
                return true;
            }
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] vis = new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(dfs(i,-1,vis,adj)){
                    return true;
                }
            }
        }
        return false;
    }
}
