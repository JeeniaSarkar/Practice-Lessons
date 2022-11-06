package mypackage;

import java.util.Scanner;

public class Tax_Calculator {
    public static void main(String[] args) {
        System.out.println("Please Enter your annual income in Lacs");
        Scanner scanner= new Scanner(System.in);
        float tax=0;
        float income=scanner.nextFloat();
        if(income<=2.5)
        {
            tax=tax+0; //0 % tax if income less equals 2.5 L
        }
        else if (income>2.5 && income<=5.0)
        {
            tax=tax+(income-2.5f) * .05f;//5% Tax if income is greater than 2.5 L and less than equals 5 L basis on income
        }
        else if(income>5.0 && income<=10) // 20 % tax if income is greater than  5 L and Less than or equals 10L
        {
            tax=tax+(5.0f-2.5f) * .05f; //Tax for income range between 2.5 to 5 Lacks (5% Tax)
            tax=tax+(income-5.0f)* 0.2f; //Tax for income range between 5 L-10 L based on income (20%)
        }
        else if(income>10.0) //25% Tax if income range more than 10 L
        {
            tax=tax+ (5.0f-2.5f)*.05f; //5% tax
            tax=tax+(10.0f-5.0f)* .2f; //20 % Tax
            tax=tax+(income-10.0f)* .25f; //25% Tax based on icome range above 10L
        }
        System.out.println("The total Tax amount: "+ (tax*100000) +"K");
    }
}
