package LearnAbstract;

abstract class  DerivedAbstarct extends BaseAbstract{

    DerivedAbstarct(){
        System.out.println("The Derived Abstarct Construtcor is called.");
    }
    @Override
    void fun() {
        System.out.println("This is class extends abstract class. Implements abstract method .");
    }
}
