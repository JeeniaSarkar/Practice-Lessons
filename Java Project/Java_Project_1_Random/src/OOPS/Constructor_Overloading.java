package OOPS;
class MyEmployee{
    int id;
    String name;
    String address;
    public MyEmployee(){
        this.id=0;
        this.name="Empty Constructor";
        this.address="Empty Address";
    }
    public MyEmployee(int id){
        this.id=id;
        this.name="Undefined";
        this.address="Undefined";
    }
    public MyEmployee(String address,int id,String name){
        this.id=id;
        this.name=name;
        this.address=address;

    }
    public MyEmployee(int id, String name, String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
}
public class Constructor_Overloading {



    public static void main(String[] args) {
       // MyEmployee employee1=new MyEmployee();
        //MyEmployee employee2=new MyEmployee(01);
        //MyEmployee employee3=new MyEmployee(02,"Jeenia");
        MyEmployee employee4=new MyEmployee(03,"Jeenia Sarkar","Habra");
        System.out.println(employee4.getId());
        System.out.println(employee4.getName());
        System.out.println(employee4.getAddress());
    }
}
