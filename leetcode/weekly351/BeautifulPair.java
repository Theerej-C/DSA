public class BeautifulPair {
    public static int countBeautifulPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(i!=j){
                    String a = nums[i]+"", b = nums[j]+"";
                    int c = Integer.parseInt(a.charAt(0)+"");
                    int d = Integer.parseInt(b.charAt(b.length()-1)+"");
                    System.out.println(c+" "+d);
                    if(isGcd(c,d)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static boolean isGcd(int a,int b){
        int gcd = 1;
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        return gcd==1?true:false;
    }

    public static void main(String[] args) {
        int[] ar = {2,5,4,1};
        System.out.println(countBeautifulPairs(ar));

    }
}
