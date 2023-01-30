import java.util.ArrayList;
import java.util.Collections;

public class SubSeq {

    public static void sub(String s, String p, ArrayList<String> ar) {
        if (s.isEmpty()) {
            ar.add(p);
            return;
        }
        char c = s.charAt(0);
        sub(s.substring(1), p, ar);
        sub(s.substring(1), p + c, ar);

    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        String s = "abc";
        sub(s, "", arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
}