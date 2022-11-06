package mypackage;

import java.util.Scanner;

public class If_Else_If_Switch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int age;
        System.out.println("Enter your age: ");
        age=scan.nextInt();
        /*if (age>56)
        {
            System.out.println("You are experienced.");
        } else if (age>46)
        {
            System.out.println("You are semi experienced");
        }
        else if (age>36)
        {
            System.out.println("You are semi semi experienced.");
        } else if (age>26)
        {
            System.out.println("You are adult only");
        }
        else
        {
            System.out.println("You are not at all experienced.");
        }*/
        switch (age)
        {

            /*case 60:{
                System.out.println("You are experienced");
                break;
            }
            case 50:{
                System.out.println("You are semi experienced.");
                break;
            }
            case 40:
            {
                System.out.println("You are gathering Experience.");
                break;
            }
            case 30:{
                System.out.println("More way to go....");
                break;
            }
            default:{
                System.out.println("Let's start having experience.");
                break;

            }*/
        }
        System.out.println("Thanks for using feature");
    }
}
