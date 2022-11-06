package mypackage;
import java.util.Scanner;
public class Percentage_Calculator {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
        System.out.println("Enter the total marks in each subject");
        float total_marks_each=scan.nextFloat();
        float total_marks=total_marks_each*5;
        float total=0.0f;
        System.out.println(total_marks);
        System.out.println("Enter the number obtained in Subject 1");
        float sub1=scan.nextFloat();
        System.out.println(sub1);
        total+=sub1;

        System.out.println("Enter the number obtained in Subject 2");
        float sub2=scan.nextFloat();
        System.out.println(sub2);
        total += sub2;

        System.out.println("Enter the number obtained in Subject 3");
        float sub3=scan.nextFloat();
        System.out.println(sub3);
        total += sub3;

        System.out.println("Enter the number obtained in Subject 4");
        float sub4=scan.nextFloat();
        System.out.println(sub4);
        total += sub4;

        System.out.println("Enter the number obtained in Subject 5");
        float sub5=scan.nextFloat();
        System.out.println(sub5);
        total += sub5;
        System.out.println(total);

        float result=(total/total_marks)*100;
        System.out.println("You have got : "+result+" percentage of total marks");

    }
}
