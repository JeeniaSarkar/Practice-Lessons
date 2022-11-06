package mypackage;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an year..............");
        int year=scan.nextInt();
        if((year % 100 !=0 && year % 4 ==0)|| (year % 100==0 && year % 400==0))
        {
            System.out.println("The year is leap year.");
        }
        else {
            System.out.println("The year is not leap year.");
        }
    }
}
