package LearnAbstract;

public class Outer2 extends Outer1 {
    @Override
    void getValuefromOuter() {
        System.out.println("Printing the method implementation from Outer child class.");
    }
    public class Inner2 extends Inner1{
        @Override
        void getValueFromInner() {
            System.out.println("Printing the method implementation from Inner child class.");
        }
    }
}
