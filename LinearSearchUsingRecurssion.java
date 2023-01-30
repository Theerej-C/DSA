import java.util.ArrayList;

public class LinearSearchUsingRecurssion {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        int[] ar = { 1, 3, 3, 4, 3, 5, 6, 7, 3 };
        linSearch(ar, 3, 0, a);
        System.out.println(a);
    }

    public static void linSearch(int[] ar, int target, int i, ArrayList<Integer> a) {
        if (i == ar.length - 1) {
            return;
        }
        if (ar[i] == target) {
            a.add(i);
        }
        linSearch(ar, target, i + 1, a);
    }
}
