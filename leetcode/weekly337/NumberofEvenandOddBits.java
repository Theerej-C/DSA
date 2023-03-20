public class NumberofEvenandOddBits {
    public static int[] evenOddBit(int n) {
        if (n == 2) {
            return new int[]{0, 1};
        }
        int even = 0;
        int odd = 0;
        int[] ar = new int[2];
        String a = Integer.toBinaryString(n);
        if (a.length() % 2 == 1) {
            for (int i = 0; i < a.length(); i++) {
                if (i % 2 == 0) {
                    if (a.charAt(i) == '1') {
                        even++;
                    }

                } else {
                    if (a.charAt(i) == '1') {
                        odd++;
                    }
                }
            }
            System.out.println(a);
            ar[0] = even;
            ar[1] = odd;

        } else {
            for (int i = 0; i < a.length(); i++) {
                if (i % 2 == 0) {
                    if (a.charAt(i) == '1') {
                        even++;
                    }

                } else {
                    if (a.charAt(i) == '1') {
                        odd++;
                    }
                }
            }
            System.out.println(a);
            ar[0] = odd;
            ar[1] = even;
        }
        return ar;
    }
    public static void main(String[] args) {
        int n = 19;
        for(int i:evenOddBit(n)){
            System.out.println(i);
        };
    }
}
