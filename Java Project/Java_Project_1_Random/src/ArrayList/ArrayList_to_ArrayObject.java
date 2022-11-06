package ArrayList;

import java.util.ArrayList;

public class ArrayList_to_ArrayObject {
    public static void main(String[] args) {
        ArrayList <Integer> arraylist=new ArrayList<>(5);
        arraylist.add(100);
        arraylist.add(200);
        arraylist.add(300);
        arraylist.add(400);
        arraylist.add(500);
        System.out.println("The List Elements are as follows................");
        for(Integer list: arraylist){
            System.out.println(list);
        }
        //converting the arraylist to array object
        Object []array1=arraylist.toArray();

        System.out.println("The converted array elements are as follows............");
        for (Object obj1:array1){
            System.out.println(obj1);
        }

    }
}
