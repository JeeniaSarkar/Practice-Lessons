package GenericInterface;

public class TestClass {
    Integer value1;
    String value2;
    TestClass(Integer value1){
        this.value1=value1;
    }
    TestClass(String value2){
        this.value2=value2;
    }
    public void printData(){
        System.out.println("Printing Data from TestClass");
    }
    public Integer getData(){
        //System.out.println("Getting Data from TestClass");
        return (this.value1+100);
    }
    public String getDataS(){
        //System.out.println("Getting Data from TestClass");
        return (this.value2+100);
    }
}
