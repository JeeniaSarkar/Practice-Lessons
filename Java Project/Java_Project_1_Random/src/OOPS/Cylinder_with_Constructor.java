package OOPS;
class myCylinder{
    int height;
    int radius;
    public myCylinder(int height, int radius){
        this.height=height;
        this.radius=radius;
    }
    public double getArea(){
        return (2*Math.PI*radius*height+2*Math.PI*radius*radius);
    }
    public double getVolume(){
        return (Math.PI*radius*radius*height);
    }
}
public class Cylinder_with_Constructor {
    public static void main(String[] args) {
        myCylinder cyl=new myCylinder(10,5);
        System.out.println("Height: "+cyl.height+" "+"Radius: "+cyl.radius);
        System.out.println("Volume :"+cyl.getVolume());
        System.out.println("Area : "+cyl.getArea());
    }
}
