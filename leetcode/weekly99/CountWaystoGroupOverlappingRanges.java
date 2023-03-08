import java.util.ArrayList;
import java.util.List;

public class CountWaystoGroupOverlappingRanges {

    public static boolean isLap(int[] int1, int[] int2) {
        return Math.max(int1[0], int2[0]) <= Math.min(int1[1], int2[1]);
    }

    public static int countWays(int[][] ranges) {
        if (ranges.length <= 2) {
            return 2;
        }
        int res = 0;
        List<List<Integer>> grp1 = new ArrayList<>();
        List<List<Integer>> grp2 = new ArrayList<>();
        for (int i = 0; i < ranges.length; i++) {

        }


        return res;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
