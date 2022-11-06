package my_method;

public class change_value {
    /*static int result;
    static int a=90;
    static int change(int x){
        result=x+5;
        return result;
    }*/

    static int change_it(int c)
    {
        c=45;
        return c;
    }
    public static void main(String[] args) {
        //System.out.println(" The changed value of a is :"+change(a));
        int c=90;
        int result_3=change_it(c);
        System.out.println("The reference value of c after running the change_it function : "+result_3);
        System.out.println("Value of c is : "+c);
    }
}
