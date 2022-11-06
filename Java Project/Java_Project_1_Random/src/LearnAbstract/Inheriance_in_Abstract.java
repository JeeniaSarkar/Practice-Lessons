package LearnAbstract;

abstract class Parent{
    abstract void firstMethod();
    abstract void socondMethod();
    abstract void thirdMethod();
}
abstract class FirstChild extends Parent{
    void firstMethod(){
        System.out.println("Calling First Method.");
    }
}
class SecondChild extends FirstChild{
    void socondMethod(){
        System.out.println("Calling Second Method.");
    }
    void thirdMethod(){
        System.out.println("Calling Third Method.");
    }
}
public class Inheriance_in_Abstract {
    public static void main(String[] args) {
        //Can't instantiated firstChild, as this is abstract class.
            //FirstChild fc=new FirstChild();
        SecondChild schild=new SecondChild();
        schild.firstMethod();
        schild.socondMethod();
        schild.thirdMethod();

    }
}
