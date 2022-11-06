package ArrayList;

import java.util.ArrayList;

public class Replace_in_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(5);
        arr.add(5);
        arr.add(10);
        arr.add(14);
        arr.add(20);
        arr.add(25);
        arr.add(30);
        arr.add(35);
        for(int a1:arr){
            System.out.println("The number is: "+a1);
        }
        System.out.println("The replaced element is : "+arr.set(2,15));
        System.out.println("The new dataset is.................");
        for (int a2:arr){
            System.out.println("The number is: "+a2);
        }
    }
}
