public class KokoEatingBananas {

    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int max = Integer.MIN_VALUE;
        for(int i:piles){
            max = Math.max(i,max);
        }
        while(left<max){
            int mid = (max+left)/2;
            int sum = sum(piles,mid);
            if(sum==h){
                return mid;
            }
             if(sum<h){
                max = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
    public static int sum(int[] p,int mid){
        int sum = 0;
        for(int i:p){
            if(i%mid!=0){
                sum++;
            }

                sum+=(i)/mid;
            
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] ar = { 30,11,23,4,20};
        int h = 6;
        System.out.println(minEatingSpeed(ar,h));

    }
}
