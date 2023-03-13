import java.util.ArrayList;
import java.util.Collections;

public class SorttheMatrixDiagonally {

    public static int[][] diagonalSort(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0;i<n-1;i++){
            sort1(mat,i,n,m);
        }
        for(int i=1;i<m;i++){
            sort(mat,i,n,m);
        }
        return mat;
    }

    private static void sort1(int[][] mat, int i,int n,int m) {
        ArrayList<Integer> ar = new ArrayList<>();
        int col = 0;
        for(int j=i;j<n;j++){
            if(col<m) ar.add(mat[j][col++]);
        }
        Collections.sort(ar);
        int a = 0;
        int col1 = 0;
        for(int j=i;j<n;j++) {

            if (col1 < m) mat[j][col1++] = ar.get(a++);
        }
    }
    private static void sort(int[][] mat, int i,int n,int m) {
        ArrayList<Integer> ar = new ArrayList<>();
        int col = 0;
        for(int j=i;j<m;j++){
            if(col<n) ar.add(mat[col++][j]);
        }
        Collections.sort(ar);
        int a = 0;
        int col1 = 0;
        for(int j=i;j<m;j++){
            if(col1<n) mat[col1++][j]=ar.get(a++);
        }
    }
    public static void main(String[] args) {
        int[][] mat = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        int[][] res = diagonalSort(mat);
        for(int[] i:res){
            for(int a:i){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
