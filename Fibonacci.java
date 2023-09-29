public class Fibonacci {
    public static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 2) + fibo(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fibo(8));
        System.out.println();
    }
}
