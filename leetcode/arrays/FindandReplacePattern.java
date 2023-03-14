import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindandReplacePattern {

    public static List<String> findAndReplacePattern(String[] words, String p) {
    List<String> ls = new ArrayList<>();
    for(String s:words){
        if(isEqual(p,s)){
            ls.add(s);
        }
    }
    return ls;
    }
    public static boolean isEqual(String p,String s){
        HashMap<Character,Character> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = p.charAt(i);
            char e = s.charAt(i);
            if(hm.containsKey(c)){
                if(e!=hm.get(c)){
                    return false;
                }
            }
            else if(hm.containsValue(e)&&!hm.containsKey(c)){
                return false;
            }
            else {
                hm.put(c,e);

            }
        }
        return true;
    }


    public static void main(String[] args) {
        String[] ar = {"a","b","c"};
        String p = "a";
        System.out.println(findAndReplacePattern(ar,p));
        System.out.println(isEqual("cccccccc","abbbbbbb"));
    }

}
