package mypackage;

import java.util.*;

public class Remove_Duplicate {
    public static void main(String[] args) {
        /*Set<Integer> set1=new HashSet<Integer>();
        set1.add(10);
        set1.add(12);
        set1.add(11);
        set1.add(10);
        set1.add(12);
        System.out.println(set1);*/
        int [] numbers=new int[6];
        numbers[0]=10;
        numbers[1]=12;
        numbers[2]=11;
        numbers[3]=10;
        numbers[4]=12;
        numbers[5]=13;
        int [] number2=new int [6];
        for(int i=0;i<numbers.length;i++) //i=5
        {
            int temp=numbers[i];//13
            boolean matchFound = false;
            for(int j=0;j<number2.length;j++)// j=5
            {
                if(temp==number2[j])//13==12
                {
                    matchFound = true;
                    break;
                }
                else {
                    matchFound = false;
                }

            }
            if(!matchFound){            //j[0]=10 //j[1]=12 //j[2]=11 //
                number2[i] = temp;
            }
        }
        for (int value:number2 ) {
            System.out.println(value);
        }
    }
}
