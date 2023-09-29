import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static void perm(String s, String us, ArrayList<String> ar) {
        if (us.isEmpty()) {
            ar.add(s);
            return;
        }

        char c = us.charAt(0);
        for (int i = 0; i <= s.length(); i++) {
            String f = s.substring(0, i);
            String sec = s.substring(i, s.length());
            perm(f + c + sec, us.substring(1), ar);
        }
    }

    public static List<List<Integer>> permArr(int[] inp, int index, List<Integer> ar) {
        if (index == inp.length) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(ar);
            return list;
        }
        int a = inp[index];
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= ar.size(); i++) {
            List<Integer> f = ar.subList(0, i);
            List<Integer> s = ar.subList(i, ar.size());
            List<Integer> res = new ArrayList<>();
            res.addAll(f);
            res.add(a);
            res.addAll(s);
            list.addAll(permArr(inp, index + 1, res));
        }
        return list;
    }
    
    public static void main(String[] args) {
        // ArrayList<String> ar = new ArrayList<>();
        // String s = "abc";
        // perm("", s, ar);
        // System.out.println(ar);
        int[] ar = { 1, 2, 3 };
        List<Integer> a = new ArrayList<>();
        System.out.println(permArr(ar, 0, a));
    }
}
