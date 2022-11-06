package mypackage;

public class Factorial {
    public static void main(String[] args) {
        /*int number=10;
        int factorial_result=1;
        for(int i=number;i>=1;i--)
        {
            factorial_result=factorial_result*i;

        }
        System.out.println("Factorial of given number "+number+ " is "+factorial_result);*/

        //Factorial using while loop

        int num2=5;
        int i=1;
        int factorial=1;
        while (i<=5)
        {
            factorial*=i;
            i++;
        }
        System.out.println("The factorial of "+ num2+ " = "+factorial);
    }
}
