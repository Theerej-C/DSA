package weekly335;

public class PassthePillow {

    public static int passThePillow(int n, int time) {
        int x = time/(n-1);
        int mod = time%(n-1);
        if(mod!=0){
            x++;
        }
        if(mod==0){
            mod = n-1;
        }
        if(x%2==0){
            return n-mod;
        }
        return mod+1;
    }

    public static void main(String[] args) {
        int a = 3;
        int b =2;
        System.out.println(passThePillow(a,b));
    }
}
