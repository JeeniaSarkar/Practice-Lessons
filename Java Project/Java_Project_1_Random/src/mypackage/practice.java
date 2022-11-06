package mypackage;

import java.lang.reflect.Array;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        int arr1[]=new int[5];
        int arr2[]=new int[5];
        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=3;
        arr1[3]=4;
        arr1[4]=5;

        arr2[0]=0;
        arr2[1]=0;
        arr2[2]=0;
        arr2[3]=0;
        arr2[4]=0;

        for(int i=0;i<arr1.length;i++){
            int target=(arr1.length-1)-i;
            arr2[target]=arr1[i];
        }
        for(int result: arr2){
            System.out.println(result);
        }
    }

}
