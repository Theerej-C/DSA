import java.util.Scanner;

public class RunningComparison {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int[] ar = new int[n];
            int[] ar1 = new int[n];
             for(int j=0;j<n;j++){
                ar[j] = sc.nextInt();
            }
             for(int j=0;j<n;j++){
                 ar1[j] = sc.nextInt();
             }
             int count = 0;
             for(int j=0;j<n;j++){
                 if(ar[j]<=2*ar1[j] && ar1[j]<=2*ar[j]){
                     count++;
                 }
             }
             System.out.println(count);
        }
    }
}

