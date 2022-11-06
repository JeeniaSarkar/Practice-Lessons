package my_method;

public class First_Method {
    //Creating a static method
    static int myMethod(int a, int b){
        int c;
        if(a>b){
            c=a-b;
        }
        else{
            c=b-a;
        }
        return c;
    }
    //creating a non-static method
    int mySum(int x, int y){
         int z;
         z=x+y;
         return z;

    }
        public static void main(String[] args) {
        //calling the static method, without creating object of the class method resides in.
            int m=9; int n=10;

            int result=myMethod(m,n);
            m=12;n=17;

        System.out.println("the result of subtraction is : "+result);
        //creating object of the class, the non-static method resides in
        First_Method object=new First_Method();

        //caling the non-static method with the help of class object.

        int result2=object.mySum(5,6);

        System.out.println("The result of addition is : "+result2);
        System.out.printf("Value of m is %d and n is %d",m,n);
    }
}
