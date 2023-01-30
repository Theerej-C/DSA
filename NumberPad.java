import java.util.ArrayList;
import java.util.List;

public class NumberPad {

    public static void numPad(String s, String p, List<String> ar) {
        if (p.isEmpty()) {
            ar.add(s);
            return;
        }
        int dig = p.charAt(0) - '0';

        for (int i = (dig - 1) * 3; i < dig * 3; i++) {
            char c = (char) ('a' + i);
            numPad(s + c, p.substring(1), ar);
        }
    }

    public static ArrayList<String> numList(String s, String p) {
        if (p.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }
        int dig = p.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (dig - 1) * 3; i < dig * 3; i++) {
            char c = (char) ('a' + i);
            list.addAll(numList(s + c, p.substring(1)));
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        numPad("", "1234", ar);
        System.out.println(numList("", "12"));
    }
}
