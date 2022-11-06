package GenericInterface;

public class StringCalculator implements Calculator<TestClass> {
    String var1;
    String var2;
    StringCalculator (String var1, String var2){
        this.var1=var1;
        this.var2=var2;
    }

    @Override
    public TestClass addition() {
        String result=var1+" "+var2;
        TestClass tc3=new TestClass(result);
        return tc3;
    }

    @Override
    public TestClass subtract() {
        return null;
    }
}
