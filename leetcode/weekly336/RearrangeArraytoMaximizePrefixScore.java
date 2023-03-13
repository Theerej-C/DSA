import java.util.Arrays;

public class RearrangeArraytoMaximizePrefixScore {

    public static int maxScore(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int i = nums.length-1;
        while(i>=0){
            sum+=nums[i];
            i--;
        }
        return sum;
    }
    public static void main(String[] args) {
        int ar[] = {-687767,-860350,950296,52109,510127,545329,-291223,-966728,852403,828596,456730,-483632,-529386,356766,147293,572374,243605,931468,641668,494446};
        System.out.println(maxScore(ar));
    }
}
