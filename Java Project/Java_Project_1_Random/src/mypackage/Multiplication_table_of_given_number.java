package mypackage;

import java.util.Scanner;

public class Multiplication_table_of_given_number {
    public static void main(String[] args) {
        int multiply_number=10;
        int start_from=1;
        int result=1;
       /* while(start_from<=10)
        {
            result=multiply_number*start_from;
            //System.out.println("Result of multiplication of "+multiply_number+" with index "+result);
            System.out.printf("%d X %d=%d\n",multiply_number,start_from,multiply_number*start_from);
            //System.out.println();
            start_from++;*/

        //Multiplication in resvese order

        for(int i=10;i>=1;i--)
        {
            System.out.printf("%d X %d=%d \n",multiply_number,start_from,multiply_number*i);


        }
    }
}
