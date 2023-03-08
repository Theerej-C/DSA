import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SplitWithMinimumSum {

    public static int count(int n){
        List<Integer> ar = new ArrayList<>();
        while(n!=0){
            ar.add(n%10);
            n/=10;
        }
        Collections.sort(ar);
        String s = "";
        String s1 = "";
        for(int i=0;i<ar.size();i++){
            if(i%2==0){
                s+=(ar.get(i)+"");
            }
            else {
                s1+=(ar.get(i)+"");
            }
        }
        int res = Integer.parseInt(s)+Integer.parseInt(s1);
        return res;
    }
    public static void main(String[] args) {
        int n = 687;
        System.out.println(count(n));
    }
}
