import java.util.Scanner;

class GraphRepInMatrix {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n + 1][n + 1];
            
            for (int i = 0; i < m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                matrix[u][v] = 1;
                matrix[v][u] = 1;
            }

            for (int[] a : matrix) {
                for (int b : a) {
                    System.out.print(b + " ");
                }
                System.out.println();
            }
        }
    }
}