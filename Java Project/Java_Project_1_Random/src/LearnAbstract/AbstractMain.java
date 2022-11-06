package LearnAbstract;

public class AbstractMain {
    public static void main(String[] args) {
        // BaseAbstract baseref=new BaseAbstract(); //can't instacnsiate abstract reference
            /*BaseAbstract derivedref= new DerivedAbstract2();
            derivedref.fun();*/

        //All the Constructor of the parent abstract classes are called while the child of abstract class is called.
            //BaseAbstract base=new DerivedAbstract2();

        //Try to instantiate a non-abstract method of an abstract class by instantiating the same.
            /*Abstract_without_AbstractMethod noabstract=new Abstract_without_AbstractMethod();
            noabstract.fun();*/

        //Calling the only  non abstract method of an abstract class using child class. As abstract class can't be instantiated.
            /*Abstract_without_AbstractMethod abs=new Abstract_without_AbstractMethod_Child();
            abs.fun();
            abs.methodFinal();
            //calling the static method of a parent abstract class.
            Abstract_without_AbstractMethod.getStatic();*/

        //Calling Method of inner and Outer abstract class method using inheritance.

        /*//Instantiating Outer abstract class Child
        Outer2 out1=new Outer2();
        //Calling method of Outer abstract class child
        out1.getValuefromOuter();
        //Instantiating Inner abstract class Child
        Outer2.Inner2 in1=out1. new Inner2();
        //Calling method of Inner abstract class child
        in1.getValueFromInner();*/

    }


    }

