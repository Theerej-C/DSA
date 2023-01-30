
public class SlidingWindow {

    public static int maxSubArray(int[] ar, int k) {
        int max = Integer.MIN_VALUE;
        int curr = 0;

        for (int i = 0; i < ar.length; i++) {
            curr += ar[i];
            if (i >= k - 1) {
                max = Math.max(max, curr);
                curr -= ar[i - (k - 1)];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] { 4, 2, 1, 7, 8, 1, 2 }, 3));
    }
}
