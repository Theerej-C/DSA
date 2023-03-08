
public class ProgramZoho {

    public static void main(String[] args) {

        String s = "PROGRAM";
        int len = s.length();
        int k = 0, c = len - 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    System.out.print(s.charAt(k));
                } else if (i + j == len - 1) {
                    System.out.print(s.charAt(c));
                } else {
                    System.out.print(" ");
                }
            }
            k++;
            c--;

            System.out.println();
        }
    }
}
