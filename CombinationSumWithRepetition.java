import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSumWithRepetition {

    public static Set<List<Integer>> comb(int[] ar, int tot, List<Integer> bs) {
        Set<List<Integer>> list = new HashSet<>();
        if (tot == 0) {
            Collections.sort(bs);


            list.add(bs);
            return list;
        }
        if (tot < 0) {
            return list;
        }

        for (int i = 0; i < ar.length; i++) {
            List<Integer> res = new ArrayList<>(bs);
            int a = ar[i];
            res.add(a);
            list.addAll(comb(ar, tot - ar[i], res));
        }
        return list;
    }

    public static void main(String[] args) {
        int[] ar = {2, 3, 5};
        List<Integer> b = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>(comb(ar, 8, b));

        System.out.println(list);
    }
}
