package Interface;
interface Animal{
    public void eat();
}
interface Mammal extends Animal{
    public void drink();
}
class Monkey implements Mammal,Animal{
    @Override
    public void eat() {
        System.out.println("Monkey Eats Banana");
    }

    @Override
    public void drink() {
        System.out.println("Monkey drinks milk from mother.");
    }
}
public class Interface_Tester2 {
    public static void main(String[] args) {
        Monkey obj2=new Monkey();
        obj2.eat();
        obj2.drink();
    }
}
