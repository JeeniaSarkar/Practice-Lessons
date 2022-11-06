package mypackage;

import java.util.Scanner;

public class print_pattern {
    public static void main(String[] args) {
       /* Scanner scan=new Scanner(System.in);
        System.out.println("Type the number of steps: ");
        int steps=scan.nextInt();
        for (int i=0;i<steps;i++)
        {
            for (int j=0;j<=i;j++) {
                System.out.print("*");

            }
            System.out.println();
        }*/

        //using while loop
        int steps=5;
        int i=steps;
        while(i>=1)//5>=1
        {
            int j=i; //5
            while(j>=1){
                System.out.print("*");
                j--;

            }
            System.out.println();
            i--;
        }
    }
}
