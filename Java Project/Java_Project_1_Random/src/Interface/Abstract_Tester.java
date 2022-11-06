package Interface;
interface Animal2{
    void eat();
}
class Dog implements Animal2{
    @Override
    public void eat() {
        System.out.println("Dog eats meat.");
    }
}
abstract class Animal3{
    abstract void bark();
    public void drink(){
        System.out.println("Animal Drinks Water");
    }
}
class Cat extends Animal3{
    @Override
    void bark() {
        System.out.println("Cat meaw, meaw");
    }
}
public class Abstract_Tester {
    public static void main(String[] args) {
    Animal2 anim2=new Dog();
    anim2.eat();
    Animal3 anim3=new Cat();
    anim3.bark();
    anim3.drink();
    }
}
