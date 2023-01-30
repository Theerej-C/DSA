
public class DcDecemberOne {
    public static void main(String[] args) {
        int num = 24;
        String s = Integer.toBinaryString(num);
        int size = s.length();
        int mid = size - 2;

        StringBuilder sd = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sd.append(s.charAt(i));
        }
        sd.reverse();
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                System.out.println(s);
            } else if (i == size - 1) {
                System.out.println(sd);
            } else {
                System.out.print(s.charAt(i));

                for (int j = 0; j < mid; j++) {
                    System.out.print("*");
                }

                System.out.print(s.charAt(size - i - 1));
                System.out.println();
            }
        }
        System.out.println(mid);
        // double n = 5;
        // System.out.println((int)Math.ceil(n/2));
    }
}
