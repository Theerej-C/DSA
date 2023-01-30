import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListRun {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Integer> hello = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                hello.add(sc.nextInt());
            }
            for (int i = 0; i < 5; i++) {
                System.out.print(hello.get(i) + " ");
            }
            System.out.println(hello);
        }
    }
}
