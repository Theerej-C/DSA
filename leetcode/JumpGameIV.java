import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class JumpGameIV {
    static int count = 0;

    public static List<List<Integer>> constructor(int[] list) {
        List<List<Integer>> ar = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            ar.add(new ArrayList<>());
        }
        int n = list.length;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < n; j++) {
                if (list[i] == list[j] && i != j) {
                    ar.get(i).add(j);
                }
            }
            if(i>0){
                ar.get(i).add(i-1);
            }
            if(i<n-1){
                ar.get(i).add(i+1);

            }
        }


        return ar;
    }

    public static int helper(List<List<Integer>> ar,int[] list){
        if(list.length==1){
            return 0;
        }
        int n = ar.size();
        int[] vis = new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                boolean b = bfs(vis,i,ar,list);
               // count++;
                if(b==true){
                    break;
                }
            }
        }
        if(count>1){
            return count;
        }
        return count;
    }

    private static boolean bfs(int[] vis,int ind, List<List<Integer>> integers, int[] list) {
        vis[ind] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.add(list[ind]);
        while(!q.isEmpty()){
            int a = q.poll();
            int flag = 0;
            for(int i:integers.get(ind)){

                if(i==list.length-1){
                    return true;
                }
                if(vis[i]==0){
                    q.add(list[i]);
                    vis[i] = 1;
                    //flag = 1;
                }
                //count++;

            }

        }
        count++;
        return false;
    }

    public static void main (String[]args){
            int[] ar = {7,6,9,6,9,6,9,7};
        System.out.println(constructor(ar));
            System.out.println(helper(constructor(ar),ar));
        }
    }

