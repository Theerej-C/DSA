import java.util.HashSet;
import java.util.Set;

public class LetterTilePossibilities {

    public static Set<String> subset(String p, String up, int ind) {
        Set<String> list = new HashSet<>();

        if (ind == up.length()) {
            return list;
        }

        list.addAll(subset(p, up, ind + 1));
        list.addAll(subset(p + up.charAt(ind), up, ind + 1));
        list.add(p);
        return list;
    }

    public static void main(String[] args) {
        String s = "ABCD";
        System.out.println(subset("", s, 0));
    }
}
