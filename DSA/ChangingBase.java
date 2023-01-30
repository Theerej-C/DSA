package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ChangingBase {
    public static String changeBase(int n){
        StringBuilder sd = new StringBuilder();
      //  ArrayList<Integer> ar = new ArrayList<>();
        while(n>0){
            sd.append(n%3);
            n=n/3;
        }
       sd.reverse();

        return sd.toString();
    }

    public static void main(String[] args) {
        System.out.println(changeBase(9));
    }
}
