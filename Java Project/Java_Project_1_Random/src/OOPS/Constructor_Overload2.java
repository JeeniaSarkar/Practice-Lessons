package OOPS;

import java.sql.SQLOutput;

class Rectangle{
    int length;
    int breadth;
    public Rectangle(){
        this.length=10;
        this.breadth=15;
    }
    public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int getLength(){
        return  length;
    }
    public int getBreadth(){
        return breadth;
    }
}
public class Constructor_Overload2 {
    public static void main(String[] args) {
        Rectangle rect=new Rectangle();
        System.out.println("Value initialized in empty constructor. ");
        System.out.println(rect.getLength());
        System.out.println(rect.getBreadth());
        Rectangle rect1=new Rectangle(20,25);
        System.out.println("Value initialized by constructor overloading ");
        System.out.println(rect1.getLength());
        System.out.println(rect1.getBreadth());
    }
}
