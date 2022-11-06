package mypackage;

import java.util.Scanner;

public class Percentage_Calc {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your marks in Maths: ");
        float maths=scan.nextFloat();
        System.out.println("Please Enter your marks in Physics: ");
        float physics=scan.nextFloat();
        System.out.println("Please Enter your marks in Chemistry: ");
        float chemistry=scan.nextFloat();

        float avg=(maths+physics+chemistry)/3.0f;
        System.out.println("Your average Marks is :"+avg);
        if(avg>=40 && maths>=34 && physics>=34 && chemistry>=34)
        {
            System.out.println("Congratulations!!! You are promoted.");
        }
        else {
            System.out.println("Sorry!!!! Better luck next time.");
        }
    }
}
