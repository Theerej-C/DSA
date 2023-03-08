import java.util.Scanner;

public class JustOneMoreEpisode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            if(a<=24){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
