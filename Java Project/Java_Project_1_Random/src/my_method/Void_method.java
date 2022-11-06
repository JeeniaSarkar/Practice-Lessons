package my_method;

public class Void_method {
    static void method1(){
        System.out.println("This a static method with no return type.");
    }
    void method2(){
        System.out.println("This sis a non-static method with no return type.");
    }
    public static void main(String[] args) {
        method1();
        Void_method obj1=new Void_method();
        obj1.method2();
    }
}
