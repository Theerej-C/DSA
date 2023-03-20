public class matrixOddCount {
    public static int oddCount(int[][] ar, int a) {
        int n = 0;
        int m = 0;
        int s = ar.length;
        int oddCount = 0;
        int falg = 0;
        
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if (ar[i][j] == a) {
                    n = i;
                    m = j;
                    break;
                }
            }
        }

        for (int i = 0; i < s; i++) {
            if (ar[n][i] % 2 == 1) {
                oddCount++;
            }
        }

        for (int i = 0; i < s; i++) {
            if (ar[i][m] % 2 == 1) {
                oddCount++;
            }
        }

        return oddCount + sub(ar, n, m);
    }

    public static int sub(int[][] mat, int n, int m) {
        int oddCount = 0;
        int rC = mat.length;
        int rowC = n;
        int colC = m;
        while (rowC >= 0 && colC >= 0) {
            if (mat[rowC][colC] % 2 == 1) {
                oddCount++;
            }
            rowC--;
            colC--;
        }
        int rowC1 = n;
        int colC1 = m;
        while ( rowC1 < rC - 1 && colC1 < rC - 1) {
            if (mat[rowC1][colC1] % 2 == 1) {
                oddCount++;
            }
            rowC1++;
            colC1++;
        }
        int rowC2 = n;
        int colC2 = m;
        while (rowC2 >= 0 && colC2 < rC - 1) {
            if (mat[rowC2][colC2] % 2 == 1) {
                oddCount++;
            }
            rowC2--;
            colC++;
        }
        int rowC3 = n;
        int colC3 = m;
        while ( colC3 >= 0 && rowC3 < rC - 1) {
            if (mat[rowC3++][colC3--] % 2 == 1) {
                oddCount++;
            }
            rowC3++;
            colC3--;
        }
        return oddCount;
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int a = 12;
        System.out.println(oddCount(mat, a));
    }
}
