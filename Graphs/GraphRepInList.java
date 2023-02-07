import java.util.ArrayList;
import java.util.Scanner;

public class GraphRepInList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            ar.add(new ArrayList<>());
            int u = sc.nextInt();
            int v = sc.nextInt();
            ar.get(u).add(v);
            ar.get(v).add(u);
        }
        for (ArrayList<Integer> a : ar) {
            for (int b : a) {
                System.out.println(b + " ");
            }
            System.out.println();
        }
    }
}
