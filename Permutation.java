import java.util.ArrayList;

public class Permutation {

    public static void perm(String s, String us, ArrayList<String> ar) {
        if (us.isEmpty()) {
            ar.add(s);
            return;
        }

        char c = us.charAt(0);
        for (int i = 0; i <= s.length(); i++) {
            String f = s.substring(0, i);
            String sec = s.substring(i, s.length());
            perm(f + c + sec, us.substring(1), ar);
        }
    }

    public static void main(String[] args) {

        ArrayList<String> ar = new ArrayList<>();
        String s = "abc";
        perm("", s, ar);
        System.out.println(ar);
    }
}
