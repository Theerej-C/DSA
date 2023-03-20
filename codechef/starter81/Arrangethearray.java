import java.util.*;

public class Arrangethearray {


    public static List<List<Integer>> permArr(List<Integer> inp, int index, List<Integer> ar) {
        if (index == inp.size()) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(ar);
            return list;
        }
        int a = inp.get(index);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= ar.size(); i++) {
            List<Integer> f = ar.subList(0, i);
            List<Integer> s = ar.subList(i, ar.size());
            List<Integer> res = new ArrayList<>();
            res.addAll(f);
            res.add(a);
            res.addAll(s);
            list.addAll(permArr(inp, index + 1, res));
        }
        return list;
    }
    public static int min(List<Integer> list){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            if(i<list.size()-1){
                min = Math.min(min,Math.abs(list.get(i)-list.get(i+1)));
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j=0;j<n;j++){
            int m = sc.nextInt();
            List<Integer> re = new ArrayList<>();
            for(int k=0;k<m;k++){
                re.add(sc.nextInt());
            }
        List<List<Integer>> ar = permArr(re, 0, new ArrayList<>());
        Collections.sort(re);
        List<Integer> des = new ArrayList<>(re);
        Collections.reverse(re);
        //System.out.println(des);
        int min = Integer.MAX_VALUE;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < ar.size(); i++) {

            if (!ar.get(i).equals(des) && !ar.get(i).equals(re)) {
                if (min > min(ar.get(i))) {
                    min = min(ar.get(i));
                    res = ar.get(i);
                }
            }
        }
        for (int i : res) {
            System.out.print(i + " ");
        }
            System.out.println();
    }
    }
}
