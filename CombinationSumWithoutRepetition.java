import java.util.ArrayList;
import java.util.List;

public class CombinationSumWithoutRepetition {

    public static List<List<Integer>> helper(int[] ar, int index, List<Integer> res, int target) {
        if (index == ar.length) {
            List<List<Integer>> result = new ArrayList<>();
            if (sum(res) == target) {
                result.add(res);
                return result;
            }
            return result;
        }
        int a = ar[index];
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> f = new ArrayList<>(res);
        f.add(a);
        result.addAll(helper(ar, index + 1, res, target));
        result.addAll(helper(ar, index + 1, f, target));
        return result;

    }

    public static int sum(List<Integer> res) {
        int sum = 0;
        for (int i : res) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] ar = { 2, 3, 6, 7, 5, 4 };
        List<Integer> b = new ArrayList<>();
        System.out.println(helper(ar, 0, b, 7));
    }
}
