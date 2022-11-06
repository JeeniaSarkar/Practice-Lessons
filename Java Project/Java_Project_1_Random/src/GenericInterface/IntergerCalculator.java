package GenericInterface;

class IntergerCalculator implements Calculator<TestClass> {
    Integer a;
     Integer b;

    IntergerCalculator(Integer a,Integer b){
        this.a=a;
        this.b=b;
    }
    @Override
    public TestClass addition() {
        Integer c= (this.a+this.b);
        TestClass tc=new TestClass(c);
        return tc;
    }

    @Override
    public TestClass subtract() {
        //return (this.a>this.b?this.a-this.b:this.b-this.a);
        TestClass tc2=new TestClass(150);
        return tc2;
    }



}
