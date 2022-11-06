package LearnInterface;



public class MainClass {
    public static void main(String[] args) {
        //The value of the final variable of interface.
            System.out.println(ParentInterface.num);
        //trying to reassigning value to final variable of interface
            //ParentInterface.num=10;
        Implementor_Class imp=new Implementor_Class();
        //reassigning value to class copy of final variable of interface.
        imp.num=9;
        //printing the class copy value of num variable
        System.out.println(imp.num);
        //caliing the displayNumber method implementation is class.
        imp.displayNumber();
    }
}
