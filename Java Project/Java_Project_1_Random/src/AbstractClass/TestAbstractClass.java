package AbstractClass;
import AbstractClass.NewAbstract;

class TestAbstractClass extends NewAbstract{

    TestAbstractClass(String string1, String string2) {
        super(string1, string2);
    }

    @Override
    public void abstractMethod() {
        System.out.println("Abstract Method.");
    }

    public static void main(String[] args) {
        TestAbstractClass obx=new TestAbstractClass("Java","Script");
        obx.abstractMethod();
        System.out.println(obx.nonAbstractMethod());

    }
}
