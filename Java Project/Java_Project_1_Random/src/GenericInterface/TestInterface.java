package GenericInterface;


import GenericInterface.IntergerCalculator;
import GenericInterface.StringCalculator;

public class TestInterface {
    public static void main(String[] args) {
        IntergerCalculator obj1=new IntergerCalculator(2,10);
        System.out.println(obj1.addition().getData());

        System.out.println(obj1.subtract());
        StringCalculator obj2=new StringCalculator("Jeenia","Sarkar");
        System.out.println(obj2.addition().getDataS());
    }
}
