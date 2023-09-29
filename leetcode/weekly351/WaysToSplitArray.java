import java.util.ArrayList;
import java.util.List;

public class WaysToSplitArray {
    public static int numberOfGoodSubarraySplits(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) {
                pos.add(i);
            }
        }
        int count = 1;
        //System.out.println(pos);
        int flag = 0;
        for(int i=0;i<pos.size()-1;i++){
            int zeroCount = pos.get(i+1)-pos.get(i)-1;
            //System.out.println(zeroCount);
            if(zeroCount!=0) {
                flag = 1;
                count *= zeroCount+1;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] ar = {0,1,0,0,1};
        System.out.println(numberOfGoodSubarraySplits(ar));
    }
}
