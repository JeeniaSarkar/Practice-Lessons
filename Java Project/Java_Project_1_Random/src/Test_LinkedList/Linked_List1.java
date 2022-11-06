package Test_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_List1 {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        // Add Method

        /*list.add("Java");
        list.add(100);
        list.add("Python");
        list.add(200);
        list.add("C++");
        list.add(300);
        System.out.println("The elements of List is as follows......");
        System.out.println(list);
        list.add("Node Js");
        list.add(400);
        System.out.println("The modified elements of List is as follows......");
        System.out.println(list);*/

        //Add based on Index
        list.add("Java");
        list.add("Python");
        list.add("Javascript");
        list.add("Ruby");
        list.add(1);
        list.add(2);
        //System.out.println(list);
        //add new value in index 2
        list.add(2,"C#");
        //System.out.println(list);

        //Add all elements of a collection to list
        ArrayList <Integer> alist=new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3);
        alist.add(4);
        alist.add(5);
        System.out.println("Traversing in arraylist elements.......");
        for (Integer a:alist){
            System.out.println(a);
        }

        //Add arraylist elements to list
        //list.addAll(alist);
        //System.out.println("All Elements of ");
        //System.out.println("Traversing in new list..........");

        //add a collection from a specific index.....
        System.out.println("Traversing in list........");
        System.out.println(list);

        //add the arraylist in 4 index in list.
        list.addAll(4,alist);
        System.out.println("New List looks as follows........."+list);
    }
}
