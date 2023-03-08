import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualElements {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int count = 0;
            int t = sc.nextInt();
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int j=0;j<t;j++){
                int a = sc.nextInt();
                if(hm.containsKey(a)) {
                    hm.put(a, hm.get(a)+1);
                } else  {
                    hm.put(a,1);
                }
            }
            int max = Integer.MIN_VALUE;
            int k = 0;
            for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
                max = Math.max(max,entry.getValue());
                if(entry.getValue()==max) {
                    k = entry.getKey();
                }
            }

            int f = 0;
            for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
                if(entry.getValue()!=max && entry.getKey()!=k){
                    count+=entry.getValue();
                }
                else if((entry.getValue()==max && f==1)){
                    count+= entry.getValue();
                }
                else if(entry.getValue()==max){
                    f=1;
                }

            }
            System.out.println(count );


        }
    }
}
