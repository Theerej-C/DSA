import java.util.Scanner;

public class SingleuseAttack {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();;
            int b = sc.nextInt();
            int c = sc.nextInt();
            int count = 0;
            while(a>=0){
                if(a<=c){
                    count++;
                    break;
                }
                a-=b;
                count++;
            }
            System.out.println(count);
        }
    }
}
