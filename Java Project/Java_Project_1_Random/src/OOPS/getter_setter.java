package OOPS;
class Employee{
    private int id;
    private String name;
    public void setId(int i){
        this.id=i;
    }
    public void setName(String n){
        this.name=n;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

public class getter_setter {
    public static void main(String[] args) {
    Employee employee1=new Employee();
    Employee employee2=new Employee();
    employee1.setId(001);
    employee1.setName("Jeenia Sarkar");
        System.out.println("The Id is : "+employee1.getId());
        System.out.println("The name is : "+employee1.getName());
        employee2.setId(002);
        employee2.setName("Manashi Sarkar");
        System.out.println("The Id is : "+employee2.getId());
        System.out.println("The Name is : "+employee2.getName());
    }
}
