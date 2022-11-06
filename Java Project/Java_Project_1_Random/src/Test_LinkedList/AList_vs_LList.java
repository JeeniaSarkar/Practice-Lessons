package Test_LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class AList_vs_LList {
    public static void main(String[] args) {
        System.out.println("Array List.................");
        ArrayList arrl=new ArrayList();
        arrl.add("Java");
        arrl.add(100);
        arrl.add("C++");
        arrl.add(200);
        System.out.println(arrl);
        Iterator itr1=arrl.iterator();
        //System.out.println(itr1);
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        System.out.println("Remove value of Index 1.............");
        arrl.remove(1); //need to delete the value of the specific index and shift the other elements available in the list to left
        System.out.println(arrl);
        System.out.println("Linked List.................");
        LinkedList linkl=new LinkedList();
        linkl.add("Java");
        linkl.add(100);
        linkl.add("C++");
        linkl.add(200);
        System.out.println(linkl);
        Iterator itr2=linkl.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("Remove the 100 Element from list");
        linkl.remove(new Integer(100));// Just removing element 100, and the pointer reference associated Java to 100.
        // Now Java stores the pointer reference of the immediate available node "C++"
        System.out.println(linkl);



    }
}
