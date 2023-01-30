import java.util.ArrayList;
import java.util.List;

public class SubSet {

    public static List<List<Integer>> sub(int[] a) {
        List<List<Integer>> ar = new ArrayList<>();
        ar.add(new ArrayList<>());
        for (int num : a) {
            int n = ar.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> b = new ArrayList<>(ar.get(i));
                b.add(num);
                ar.add(b);
            }
        }
        return ar;
    }

    public static void main(String[] args) {

        int[] ar = { 1, 2, 3, 4, 5 };
        List<List<Integer>> a = sub(ar);

        for (List<Integer> ls : a) {
            System.out.println(ls);
        }
    }
}
