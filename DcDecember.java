
public class DcDecember {
    public static void main(String[] args) {
        char[] ar = { '0', '1', '2', '3', '4', '1', '2', '3', '4', '5', '6' };
        int count = 0;
        for (int i = 0; i < ar.length; i += count) {
            if (i + count >= ar.length) {
                for (int k = 0; k <= (count) - (ar.length - i); k++) {
                    System.out.print("*" + " ");
                }
                for (int j = ar.length - 1; j >= i; j--) {
                    System.out.print(ar[j] + " ");
                }
                break;
            } else {
                for (int j = i + count; j >= i; j--) {
                    System.out.print(ar[j] + " ");
                }
            }
            count++;
            System.out.println();
        }
    }
}
