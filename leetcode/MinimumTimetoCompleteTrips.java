import java.util.ArrayList;
import java.util.HashMap;

public class MinimumTimetoCompleteTrips {
    public static long minimumTime(int[] time, int totalTrips) {
        int left = 1;
        int min = Integer.MAX_VALUE;
        for(int i:time){
            min = Math.min(i,min);
        }
        int right = totalTrips * min;
        while(left<right){
            int mid = left + (right-left)/2;
            if(sum(time,mid)<totalTrips){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }
    public static int sum(int[] ar,int mid){
        int sum = 0;
        for(int i=0;i<ar.length;i++){
            sum+=((long)mid/ar[i]);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] ar = {1,2,3};
        int s = 5;
        System.out.println(minimumTime(ar,s));
    }
}
