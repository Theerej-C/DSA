import java.util.ArrayList;
import java.util.List;

public class MinimumWindowSubstring {

    public static boolean isPresent(String s,String t){
        for(int i=0;i<t.length();i++){
            if(!s.contains(t.charAt(i)+"")){
                return false;
            }
        }
        return true;
    }
    public static String minWindow(String s, String t) {
        int start = 0;
        int end = 0;
        int min = Integer.MAX_VALUE;
        String ans = "";
        while(start<end){
            String res = s.substring(start,end);
            if(isPresent(res,t)){
                if(min<res.length()){
                    min = res.length();
                    ans = res;
                }
            }
        }
    return ans;
    }
    public static void main(String[] args) {

    }
}
