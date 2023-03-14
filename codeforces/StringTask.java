import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        String r = "AEIOUYaeiouy";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!r.contains(c+"")){
                ans+="."+Character.toLowerCase(c);
            }
        }
        System.out.println(ans);
    }
}
