public class OptimalPartitionofString {

    public static int partitionString(String s) {
        int count = 0;
        //int start = 0;
        int end = 0;
        int n = s.length();
        int[] ar = new int[26];
        while (end < n) {
            char c = s.charAt(end);
            if(ar[c-'a']!=0){
                count++;
                ar = new int[26];
            }
            else{
                ar[c-'a']++;
                end++;
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        String s = "abacaba";
        System.out.println(partitionString(s));
//        int[] ar = new int[3];
//        ar[0] = 9;
//        ar[1] = 7;
//        for(int i:ar){
//            System.out.println(i+" ");
//        }
//        ar = new int[26];
//        for(int i:ar){
//            System.out.println(i+" ");
//        }
    }
}
