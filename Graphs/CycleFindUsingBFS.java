import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleFindUsingBFS {
    private class pair{
        int f;
        int s;
        pair(int f,int s){
            this.f = f;
            this.s = s;
        }
    }
    private boolean bfs(int node,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[node] = true;
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(node,-1));
        while(!q.isEmpty()){
            pair p = q.poll();
            int no = p.f;
            int par = p.s;
            for(int list:adj.get(no)){
                if(!vis[list]){
                    vis[list] = true;
                    q.add(new pair(list,no));
                }
                else if(par!=list){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(bfs(i,vis,adj)){
                    return true;
                }
            }
        }
        return false;
    }
}
