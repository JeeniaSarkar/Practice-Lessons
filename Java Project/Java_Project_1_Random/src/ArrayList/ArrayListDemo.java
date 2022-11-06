package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <Integer>arraylist1=new ArrayList<Integer>(5);
        arraylist1.add(1);
        arraylist1.add(2);
        arraylist1.add(3);
        arraylist1.add(4);
        arraylist1.add(5);


        //arraylist1.add(0,10);

        ArrayList <Integer> arraylist2=new ArrayList<>(5);
        arraylist2.add(6);
        arraylist2.add(7);
        arraylist2.add(8);
        arraylist2.add(9);
        arraylist2.add(10);

        /*for (Integer element1:arraylist1){ //Iteration through elements of arraylist 1

            System.out.println("The elements of arraylist 1: "+element1);
        }
        System.out.println("..........................................");
        for (Integer element2:arraylist2){ //Iteration through elements of arraylist 2

            System.out.println("The elements of arraylist 2: "+element2);
        }
        System.out.println("..........................................");
        arraylist1.addAll(arraylist2); //Adding the elements of array2 to array1

        for(Integer finalelements: arraylist1){
            System.out.println("The elements of the newly made array: "+finalelements);
        }


        //add a collection to a specific index of the already existing arraylist
        arraylist1.addAll(1,arraylist2);
        for (Integer final_elements:arraylist1){
            System.out.println("Newly made array: "+final_elements);
        }
        */
        System.out.println("The size of Array2 before element removal is : "+arraylist2.size());
        //perform clear () function
        arraylist2.clear();
        System.out.println("The size of Array2 after removal is : "+arraylist2.size());
    }
}
