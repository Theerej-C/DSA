public class CountTotalNumberofColoredCells {

    public static long coloredCells(int n) {
        long res = 1;

        for(int i=1;i<n;i++){
            res+=(4*i);
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(coloredCells(n));
    }
}
