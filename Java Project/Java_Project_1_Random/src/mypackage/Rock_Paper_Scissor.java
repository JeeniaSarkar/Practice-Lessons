package mypackage;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        //rock=0
        //paper=1
        //scissor=2
        int computer_input;
        int user_input;
        Random random=new Random();
        computer_input=random.nextInt(3);

        //Take user input
        Scanner scan=new Scanner(System.in);
        System.out.println("Input numbers between 0 to 2");
        System.out.println("0 for Rock, 1 for Paper, 2 for Scissor");
        user_input=scan.nextInt();
        if(computer_input==user_input){
            System.out.println("The match is draw.");
        } else if (computer_input==0 && user_input==1 || computer_input==1 && user_input==2 || computer_input==2 && user_input==0){
            {
                System.out.println("Congratulations!!!! You win");
            }
        }
        else {
            System.out.println("Computer wins!!! Better Luck Next Time");
        }
        System.out.println("Computer Input : "+computer_input);
        System.out.println("User Input : "+user_input);
    }
}
