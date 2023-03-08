import java.util.Scanner;

public class MatrixPain {

    public static int[][] contructor(int n,int m){
        int[][] ar = new int[n][m];
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ar[i][j] = count;
                count++;
                //System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        return ar;
    }
    public static int sum(int[][] ar){
        long sum  = 0;
        for (int[] a:
             ar) {
            for (int i:
                 a) {
                sum+=i;
            }
        }
        return (int)sum%1000000007;
    }
    public static void main(String[] args) {
        //contructor(1,3);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            int[][] ar = contructor(N,M);
            for(int j=0;j<K;j++){
                int q = sc.nextInt();
                int x = sc.nextInt();
                int v = sc.nextInt();
                if(q==0){
                    for(int k=0;k<M;k++){
                        ar[x-1][k] *= v;
                    }
                }
                if(q==1){
                    for(int k=0;k<N;k++){
                        ar[k][x-1] *= v;
                    }
                }
            }
            System.out.println(sum(ar));
        }
    }
}
