package my_method;

public class change_array {
    int  change_array(int [] array1){
        array1[0]=100;
        int a=array1[0];
        return  a;
    }
    public static void main(String[] args) {
    int [] array2={1,2,3,4,5};
        System.out.println("The 0 index value of array = "+array2[0]);
    change_array obj1=new change_array();
    int result1=obj1.change_array(array2);

        System.out.println("The 0 index of array after running change_array method ="+result1);
    }
}
