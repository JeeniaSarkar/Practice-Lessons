package OOPS;
class Cylinder{
    private int height;
    private int radius;
    public void setHeight(int height){
        this.height=height;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public int getHeight(){
        return height;
    }
    public int getRadius(){
        return radius;
    }
    public double getArea(){
        return (2*Math.PI*radius*height+2*Math.PI*radius*radius);
    }
    public double getVolume(){
        return(Math.PI*radius*radius*height);
    }
}
public class Cylinder_with_Getter_Setter {

    public static void main(String[] args) {
    Cylinder cylinder=new Cylinder();
    cylinder.setHeight(15);
    cylinder.setRadius(20);
    System.out.println("The height of cylinder is : "+cylinder.getHeight());
    System.out.println("The radius of cylinder is : "+cylinder.getRadius());
    System.out.println("The volume of cylinder is : "+cylinder.getVolume());
    System.out.println("The area of cylinder is : "+cylinder.getArea());
    }
}
