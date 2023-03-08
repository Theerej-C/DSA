import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TopologicalSort {

    public static boolean hasCycle(ArrayList<ArrayList<Integer>> list, Map<Integer, Integer> m) {

        for (int i = 0; i < list.size(); i++) {
            for (Integer j : list.get(i)) {
                if (m.get(i) > m.get(j)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void helper(ArrayList<ArrayList<Integer>> list, int n, Stack<Integer> res) {
        int[] vis = new int[n];
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                dfs(list, res, vis, i);
            }
        }

    }

    private static void dfs(ArrayList<ArrayList<Integer>> list, Stack<Integer> res, int[] vis, int i) {
        vis[i] = 1;
        for (int h : list.get(i)) {
            if (vis[h] == 0) {
                dfs(list, res, vis, h);
            }
        }
        res.push(i);
    }

    public static ArrayList<ArrayList<Integer>> constructor(int[][] ar, int n) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < ar.length; i++) {
            res.get(ar[i][0]).add(ar[i][1]);
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] ar = { { 1, 2 }, { 0, 1 }, { 1, 4 }, { 3, 2 }, { 2, 4 }, { 4, 1 } };
        System.out.println(constructor(ar, n));
        Stack<Integer> st = new Stack<>();
        helper(constructor(ar, n), n, st);
        int ind = 0;
        ArrayList<Integer> res = new ArrayList<>();
        Map<Integer, Integer> m = new HashMap<>();
        while (!st.isEmpty()) {
            res.add(st.peek());
            m.put(st.peek(), ind);
            ind += 1;
            st.pop();
        }
        System.out.println(res);
        System.out.println(hasCycle(constructor(ar, n), m));
    }

}
