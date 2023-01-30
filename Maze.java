import java.util.ArrayList;

public class Maze {

    public static int ways(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        return ways(r - 1, c) + ways(r, c - 1);
    }

    public static ArrayList<String> waysPrint(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> ar = new ArrayList<>();
            ar.add(p);
            return ar;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c > 1) {
            list.addAll(waysPrint(p + "d", r - 1, c - 1));
        }
        if (r > 1) {
            list.addAll(waysPrint(p + "D", r - 1, c));
        }
        if (c > 1) {
            list.addAll(waysPrint(p + "R", r, c - 1));
        }

        return list;
    }

    public static void waysWithObs(String p, int[][] ar, int r, int c) {
        if (r == ar.length - 1 && c == ar[0].length - 1) {
            // ArrayList<String> list = new ArrayList<>();
            System.out.println(p);
            return;
        }
        if (ar[r][c] == 1) {
            return;
        }
        // ArrayList<String> list = new ArrayList<>();
        if (r < ar.length - 1) {
            waysWithObs(p + "D", ar, r + 1, c);
        }
        if (c < ar[0].length - 1) {
            waysWithObs(p + "R", ar, r, c + 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(ways(3, 3));
        System.out.println(waysPrint("", 3, 3));
        int[][] ar = {
                { 0, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 0 },
        };
        waysWithObs("", ar, 0, 0);
    }
}
