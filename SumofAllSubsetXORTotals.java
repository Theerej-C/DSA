import java.util.ArrayList;

import javax.sound.midi.Soundbank;

public class SumofAllSubsetXORTotals {

    public static void helper(int[] ar, int index, int sum, ArrayList<Integer> ans) {
        if (index == ar.length) {
            ans.add(sum);
            return;
        }

        int s = ar[index];
        helper(ar, index + 1, sum ^ s, ans);
        helper(ar, index + 1, sum, ans);
    }

    public static void main(String[] args) {
        int[] ar = { 1, 3 };
        ArrayList<Integer> res = new ArrayList<>();
        helper(ar, 0, 0, res);
        System.out.println(res);
        int sum = 0;
        for (int i : res) {
            sum += i;
        }
        System.out.println(sum);
    }

    // 0 + 5 + 1 + 6 + 4 + 3 + 7 + 2
}
