package Array;
import java.sql.Array;
import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the total numbers to taken as input: ");
        int total_number=scan.nextInt();
        int arr[]=new int [total_number];
        int arr2[]=new int [total_number];
        System.out.println("Enter the actual numbers: ");
        for (int i=0;i<total_number;i++)
        {
            arr[i]=scan.nextInt();
            scan.nextLine();
        }
        for (int j=total_number-1;j>=0;j--) // j=4
        {
            int diff=total_number-(j+1); //diff=5-(0+1)
            arr2[diff]=arr[j];
        }
        System.out.println("New Array Value: ");
        for (int x:arr2)

             {
                 System.out.println(x);
        }
    }

}
