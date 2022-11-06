package ArrayList;

import java.util.ArrayList;

public class ArrayList_to_Array2 {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist2= new ArrayList<>();
        arraylist2.add(500);
        arraylist2.add(400);
        arraylist2.add(300);
        arraylist2.add(200);
        arraylist2.add(100);
        System.out.println("Printing Elements of ArrayList.............");
        for (Integer element1:arraylist2){
            System.out.println(element1);
        }
        //converting arraylist elements to array elements
        System.out.println("Printing Elements of Array.............");
        Integer [] array2=new Integer[arraylist2.size()];
        array2=arraylist2.toArray(array2);
        for (Integer element2: array2){
            System.out.println(element2);
        }



    }
}
