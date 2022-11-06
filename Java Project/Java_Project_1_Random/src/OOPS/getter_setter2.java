package OOPS;

import java.util.Scanner;

class Circle{
    private double radius;
    private double area;
    private double perimeter;
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }

    public void setArea(double area,double radius){
        double calculated_area=Math.round(Math.PI*radius*radius);
        System.out.println("calculated area: "+calculated_area);
        if(calculated_area==area){
            this.area=area;
        }
        else{
            System.out.println("Sorry you have entered wrong Area based on Radius");
        }
    }
    public void setPerimeter(double perimeter,double radius){
        double calculated_perimeter=Math.round(2*Math.PI*radius);
        System.out.println("calculated perimeter: "+calculated_perimeter);
        if(calculated_perimeter==perimeter){
            this.perimeter=perimeter;
        }
        else {
            System.out.println("Sorry you have entered wrong Area based on Radius");
        }
    }
    public double getArea(){

        return area;
    }
    public double getPerimeter(){
        return perimeter;
    }
}
public class getter_setter2 {


    public static void main(String[] args) {
        Circle circle=new Circle();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter radius..........");
        int my_radius=scan.nextInt();
        System.out.println("Enter Area.............");
        int my_area=scan.nextInt();
        System.out.println("Enter Perimeter.............");
        int my_perimeter=scan.nextInt();
        circle.setRadius(my_radius);
        circle.setArea(my_area,my_radius);
        System.out.println("The area of circle with radius :"+ circle.getRadius()+" is "+circle.getArea());
        circle.setPerimeter(my_perimeter,my_radius);
        System.out.println("The perimeter of circle with radius :"+circle.getRadius()+" is "+circle.getPerimeter());
    }


}

