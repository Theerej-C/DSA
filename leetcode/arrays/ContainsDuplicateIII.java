import java.util.ArrayList;
import java.util.List;

public class ContainsDuplicateIII {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        for (int i = 0; i < nums.length-1; i++) {
            for(int j=i+1;j<nums.length;j++){
                if(i!=j){
                    if(Math.abs(i-j)==indexDiff){
                        if(Math.abs(nums[i]-nums[j])==valueDiff){
                            return true;
                        }
                    }
                    if(Math.abs(i-j)>indexDiff){
                        break;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
    int[] ar = {1,5,9,1,5,9};
    int id = 2;
    int vd = 3;
        System.out.println(containsNearbyAlmostDuplicate(ar,id,vd));
    }
}
