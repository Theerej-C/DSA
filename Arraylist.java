
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(7);
        ar.add(5);
        ar.add(4);
        System.out.println(ar.remove(0));
        System.out.println("Hello world"); 
        for (int i : ar) {
            System.out.println(i);
        }

    }
}
