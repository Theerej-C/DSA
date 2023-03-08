public class CountSubarraysWithFixedBounds {
    /*
    * This method is fine but in the side of equal numbers with min and max the count is not increasing
    * So need to edit the method.
    * */
//    public static boolean isMinMax(int[] ar,int start,int end,int min,int max){
//        int mini = Integer.MAX_VALUE;
//        int maxi = Integer.MIN_VALUE;
//        if(start==end){
//            if(ar[start]==max&&ar[start]==min){
//                return true;
//            }
//        }
//        for(int i=start;i<end;i++){
//            if(ar[i]>maxi){
//                maxi = ar[i];
//            }
//            if(ar[i]<mini) {
//                mini = ar[i];
//            }
//        }
//        if(min!=mini || max!=maxi){
//            return false;
//        }
//
//        return true;
//    }
//    public static long countSubarrays(int[] nums, int minK, int maxK) {
//        long count = 0;
//        int start = 0;
//        int end = 0;
//        int len = nums.length;
//        while(end<len){
//            if(isMinMax(nums,start,end,minK,maxK)){
//                //count++;
//                int a = start;
//                int b = end;
//                while(isMinMax(nums,a,b,minK,maxK)&&b<len) {
//                    count++;
//                    b++;
//                }
//                start++;
//            }
//            end++;
//        }
//        return count;
//    }
    public static void main(String[] args) {
        int[] ar = {1,3,5,2,7,5};
        int[] ar1 = {1,1,1,1};
        System.out.println(countSubarrays(ar1,1,1));
        System.out.println(countSubarrays(ar,1,5));
    }

    private static long countSubarrays(int[] ar1, int min, int max) {
        long res = 0;
        int len = ar1.length;
        boolean minF = false,maxF = false;
        int minPos = 0, maxPos = 0,start = 0;
        for(int i=0;i<len;i++){
            int n = ar1[i];
            if(n>max || n<min){
                minF = false;
                maxF = false;
                start = i+1;
            }
            if(n==max){
                maxF = true;
                maxPos = i;
            }
            if(n==min){
                minF = true;
                minPos = i;
            }
            if(maxF && minF){
                res+=(Math.min(maxPos,minPos)-start+1);
            }
        }
        return res;
    }
}
