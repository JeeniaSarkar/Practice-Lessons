package LearnInterface;

public class Implementor_Class implements ParentInterface{
int num=2;

    @Override
    public void displayNumber() {
        System.out.println("This is the display number function.");
    }
}
