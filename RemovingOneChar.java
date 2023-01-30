public class RemovingOneChar {

    public static void remove(String s, StringBuilder sd, int index, char c) {
        if (index == s.length()) {
            return;
        }
        if (s.charAt(index) != c) {
            sd.append(s.charAt(index));
        }
        remove(s, sd, index + 1, c);
    }

    public static String rem(String s, char b) {
        if (s.isEmpty()) {
            return "";
        }
        char c = s.charAt(0);
        if (c == b) {
            return rem(s.substring(1), b);
        } else {
            return c + rem(s.substring(1), b);
        }
    }

    public static String removeString(String s, String d) {
        if (s.isEmpty()) {
            return "";
        }
        if (s.startsWith(d)) {
            return removeString(s.substring(d.length()), d);
        } else {
            return s.charAt(0) + removeString(s.substring(1), d);
        }
    }

    public static void main(String[] args) {
        String s = "afdasdfsadfafasdfasd";
        char c = 'a';
        String g = "helloappleboyapplesafgfasdgdfsgsdf";
        String d = "apple";
        StringBuilder sd = new StringBuilder();
        remove(s, sd, 0, c);
        System.out.println(sd.toString());
        System.out.println(rem(s, c));
        System.out.println(removeString(g, d));
    }
}
