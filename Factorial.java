public class Factorial {
    public static void main(String[] args) {

        int fact = 4;
        System.out.println(factorial(fact));
        System.out.println(addNum(12345));
        long l = (long) 12321;
        System.out.println(rev(l));
        Long l1 = Long.parseLong(rev(l));
        System.out.println(l1);
        System.out.println(palindrome(l));
    }

    public static int factorial(int n) {
        return n == 1 ? 1 : n * factorial(--n);
    }

    public static int addNum(int n) {
        return n == 0 ? 0 : n % 10 + addNum(n / 10);
    }

    public static String rev(Long n) {
        if (n < 10) {
            return Long.toString(n);
        }
        return Long.toString(n % 10) + rev(n / 10);
    }

    public static boolean palindrome(Long n) {
        return n.equals(Long.parseLong(rev(n)));
    }
}