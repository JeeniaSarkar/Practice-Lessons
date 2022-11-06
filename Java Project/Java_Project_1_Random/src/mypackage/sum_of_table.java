package mypackage;

public class sum_of_table {
    public static void main(String[] args) {
        int table_of=8;
        int i=10;
        int result=1; //20
        int temp=0;
        while(i>=1) //10>=1
        {
            result=table_of*i; //10*10=100
            System.out.println(result);
            temp=temp+result; //0+5+20=25
            i--;
        }
        System.out.println("Summation of multiplication table of "+table_of+ " is "+temp);
    }
}
