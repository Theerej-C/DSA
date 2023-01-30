public class Recurssion {

    public static void main(String[] args) {
        System.out.print(print1(9));
    }

    static int print1(int n) {
        if (n == 1) {
            // System.out.println(1);
            return 1;
        }
        System.out.println(print1(n - 1));
        return n;
    }
}
