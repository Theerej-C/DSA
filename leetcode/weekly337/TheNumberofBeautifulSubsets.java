import java.util.ArrayList;
import java.util.List;

public class TheNumberofBeautifulSubsets {

    public static int beautifulSubsets(int[] nums, int k) {
        int count = 0;
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        helper(nums,0,a,ar);
        for(ArrayList<Integer> g:ar){
            if(isBeautiful(g,k)){
                count++;
            }
        }
        System.out.println(ar);
        return count;
    }
    public static void helper(int[] n,int ind,ArrayList<Integer> ar,ArrayList<ArrayList<Integer>> arr){
        if(ind==n.length){
            arr.add(ar);
            return;
        }
        ArrayList<Integer> temp = new ArrayList<>(ar);
        temp.add(n[ind]);
        helper(n,ind+1,ar,arr);
        helper(n,ind+1,temp,arr);
    }
    public static boolean isBeautiful(ArrayList<Integer> ar,int k){
        if(ar.size()==0){
            return false;
        }
        for(int i=0;i<ar.size();i++){
            for(int j=i;j<ar.size();j++){
                if(Math.abs(ar.get(i)-ar.get(j))==k) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] ar = {1};
        System.out.println(beautifulSubsets(ar,1));
    }
}
