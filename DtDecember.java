
public class DtDecember {

    public static void main(String[] args) {
        String s = "Program";
        int count = 2;
        for (int i = 0; i < s.length(); i++) {
            if ((i == s.length() / 2)) {
                System.out.println(s.charAt(i));
                break;
            }
            System.out.print(s.charAt(i));
            int j = 0;
            while (j < count) {
                System.out.print("*");
                j++;
            }
            System.out.print(s.charAt(s.length() - i - 1));
            System.out.println();
            count--;
        }
        int count1 = 2;
        for (int i = s.length() / 2 - 1; i >= 0; i--) {

            System.out.print(s.charAt(i));
            int j = 0;
            while (j < count) {
                System.out.print("*");
                j++;
            }
            System.out.print(s.charAt(s.length() - i - 1));

            int c = 0;
            if (c < count) {
                while (c > 0) {
                    System.out.print("*");
                    c--;
                }
            }
            System.out.println();
        }
    }
}
