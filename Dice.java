import java.util.ArrayList;

public class Dice {

    public static ArrayList<String> dic(String s, int tar) {
        if (tar == 0) {
            ArrayList<String> ar = new ArrayList<>();
            ar.add(s);
            return ar;
        }
        ArrayList<String> ar = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= tar; i++) {
            ar.addAll(dic(s + i, tar - i));
        }
        return ar;
    }
    public static void main(String[] args) {

        System.out.println(dic("", 4));

    }
}
