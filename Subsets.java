import java.util.ArrayList;

public class Subsets {
    public static ArrayList<ArrayList<Integer>> helper(int[] ar, int index, ArrayList<Integer> res) {
        if (index == ar.length) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            list.add(res);
            return list;
        }
        int a = ar[index];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>(res);
        b.add(a);
        list.addAll(helper(ar, index + 1, b));
        list.addAll(helper(ar, index + 1, res));

        return list;
    }

    public static void main(String[] args) {
        int[] ar = { 1, 2, 3, 4 };
        System.out.println(helper(ar, 0, new ArrayList<>()));
    }
}
