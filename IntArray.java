import java.util.Arrays;
import java.util.Scanner;
 class Array {
    public static void main(String[] args) {
        //syntax datatype[] varname = new datatype[size]
        Scanner in = new Scanner(System.in);
        int[] hello = new int[5];//declaration
        int[] hello2 = {78,67,56,5};//value given

        for(int i=0;i<hello.length;i++){
            hello[i] = in.nextInt();
        }
        System.out.println(hello2[3]);

        //for(int i=0;i<hello.length;i++){
          //  System.out.println(hello[i]);
        //}
        for(int num : hello){
            System.out.println(num+" ");
        } // This is known as for each loop as it iterates the
        // total
        System.out.println(Arrays.toString(hello));
        /* this will change any of the array to string array and print
        it. It contains the for loop
         */

    }
}
