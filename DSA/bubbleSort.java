package DSA;

public class bubbleSort {

    public static void bubble(int[] ar){
        int N = ar.length;
        int k;
        for(int m=0;m<N;m++){
            for(int i=0;i<ar.length-1;i++){
                k=i+1;
                if(ar[i]>ar[k]){
                    swap(i,k,ar);
                }
            }
        }

    }
    public static void swap(int A,int B, int[] array){
        int temp = array[A];
        array[A] = array[B];
        array[B] = temp;

    }

    public static void main(String[] args) {
    int[] ar = {1,3,2,7,4,8};
        bubble(ar);
        for (int j : ar) {
            System.out.println(j);
        }
    }

}
