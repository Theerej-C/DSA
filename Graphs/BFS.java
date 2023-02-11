import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
     public static void main(String args[]) {

        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        
        ArrayList < Integer > ans = bfsOfGraph(5, adj);
        int n = ans.size(); 
        for(int i = 0;i<n;i++) {
            System.out.print(ans.get(i)+" "); 
        }
    }

    private static ArrayList<Integer> bfsOfGraph(int i, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[i];
        q.add(0);
        vis[0] = true;
        while (!q.isEmpty()) {
            int a = q.poll();
            res.add(a);
            for (int l : adj.get(a)) {
                if (vis[l] == false) {
                    q.add(l);
                    vis[l] = true;
                }
            }
        }
        return res;
    }
}
