package weekly335;

public class SplittheArraytoMakeCoprimeProducts {

    public static int gcd(int[] ar,int ind){
        long pSum = 1;
        long sSum = 1;
        for(int i=0;i<=ind;i++){
            pSum*=ar[i];
        }
        for(int i=ind+1;i<ar.length;i++){
            sSum *= ar[i];
        }

        return (int)findGCD(sSum,pSum);
    }
    public static long findGCD(long a,long b){
        if (b == 0)
            return a;
        if(b>a){
            return findGCD(b, a % b);
        }
        return findGCD(a, b % a);
    }
    public static void main(String[] args) {
        int[] ar = {557663,280817,472963,156253,273349,884803,756869,763183,557663,964357,821411,887849,891133,453379,464279,574373,852749,15031,156253,360169,526159,410203,6101,954851,860599,802573,971693,279173,134243,187367,896953,665011,277747,439441,225683,555143,496303,290317,652033,713311,230107,770047,308323,319607,772907,627217,119311,922463,119311,641131,922463,404773,728417,948281,612373,857707,990589,12739,9127,857963,53113,956003,363397,768613,47981,466027,981569,41597,87149,55021,600883,111953,119083,471871,125641,922463,562577,269069,806999,981073,857707,831587,149351,996461,432457,10903,921091,119083,72671,843289,567323,317003,802129,612373};
        int flag = 0;
        for(int i=0;i<ar.length-1;i++){
            if(gcd(ar,i)==1){
                flag=1;
                System.out.println(i+" "+gcd(ar,i));
                //break;
            }
        }
        if(flag==0){
            System.out.println(-1);
        }
        //System.out.println(gcd(ar,1));
    }
}
