package mypackage;
import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        //float a=(7/4.0f*9/2);
        //System.out.println(a);
        /*char grade='A';

        int new_grade=grade+5; //int value
        System.out.println("ASCII value of new grade : "+new_grade);
        char new_grade_ascii=(char)new_grade; //char value
        System.out.println("Char value of new grade : "+new_grade_ascii);
        int new_grade2=new_grade_ascii-5; //int value
        System.out.println(new_grade2);
        char decrypt=(char) new_grade2; //char value
        System.out.println(decrypt);*/

        float fixed_value= 10.0f;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        float number=scan.nextFloat();
        boolean result= (number>fixed_value);
        System.out.println("Is the entered number greater than fixed value ? "+result);



    }
}
