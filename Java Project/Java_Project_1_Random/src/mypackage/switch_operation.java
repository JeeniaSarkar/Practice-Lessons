package mypackage;

import java.util.Locale;
import java.util.Scanner;

public class switch_operation {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        String operation;
        System.out.println("Please Enter the operation name: (between add/subtract/multiply/divide");
        Scanner scan=new Scanner(System.in);
        operation=scan.next();
        String operation_final=operation.toLowerCase(Locale.ROOT);
        switch (operation_final){
            case "add":{
                System.out.println(a+b);
                break;
            }
            case "subtract":{
                System.out.println(a-b);
                break;
            }
            case "multiply":{
                System.out.println(a*b);
                break;
            }
            case "divide": {
                System.out.println(a / b);
                break;
            }
            default:{
                System.out.println("Not a valid operation");
            }
        }
    }
}
