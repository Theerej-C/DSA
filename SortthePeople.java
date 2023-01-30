import java.util.Arrays;
import java.util.HashMap;

public class SortthePeople {

    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> hm = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            hm.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        int count = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            names[count++] = hm.get(heights[i]);
        }

        return names;
    }

    public static void main(String[] args) {

        String[] names = { "Mary", "John", "Emma" };
        int[] heights = { 180, 165, 170 };

        sortPeople(names, heights);
        for (int i = 0; i < heights.length; i++) {
            System.out.println(names[i]);
        }
    }
}
