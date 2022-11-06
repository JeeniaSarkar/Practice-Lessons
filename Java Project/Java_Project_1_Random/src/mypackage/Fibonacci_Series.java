package mypackage;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int temp;
        int value1=0;//2
        int value2=1;//3
        System.out.println(value1);
        System.out.println(value2);
        for(int i=0;i<10;i++){

            temp=value2+value1;// 3                   0,1,1,2,3,5
            value1=value2;//2
            value2=temp;//3
            System.out.println(value2);

        }
    }

}
