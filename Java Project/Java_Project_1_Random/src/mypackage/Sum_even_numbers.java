package mypackage;

public class Sum_even_numbers {
    public static void main(String[] args) {
        int number=10;
        int i=0;
        int sum=0;
        while(i<number) //9<10
        {
            sum=sum+(2*i); //sum=0+2+4+6+8+10+12+14+16+
            i++;
        }
        System.out.println("The summation of first 10 even numbers is :"+sum);
    }
}
