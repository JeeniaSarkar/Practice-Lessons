package my_method;

public class Method_Oveloading {
    static void welcome(){
        System.out.println("Welcome to method overloading ");
    }
    static void welcome(String name){
        System.out.println("Welcome to method overloading "+name);
    }
    static void welcome(String name, String surname){
        System.out.println("Welcome to method overloading "+ name +" "+surname);
    }
    public static void main(String[] args) {
        welcome("Jeenia","Sarkar");
    }
}
