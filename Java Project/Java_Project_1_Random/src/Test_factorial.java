import java.util.Scanner;

public class Test_factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number to find it's factorial.");
        int input=scan.nextInt();
        int result=1;
        for (int i=1;i<=input;i++){
            result=result*i;
        }
        System.out.println("The factorial of "+input+" is : "+result);
    }
}
