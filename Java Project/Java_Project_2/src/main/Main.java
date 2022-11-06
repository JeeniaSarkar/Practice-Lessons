package main;

import animal.Animal;
import animal.Dog;
import child_animal.Cat;
public class Main extends Animal{
    public static void main(String[] args) {
        Cat redCat=new Cat("Red");
        System.out.println(redCat.getBodyColour());
        Dog whiteDog=new Dog("White");
        //System.out.println(whiteDog.getBodyColour());
    }
}