package Test_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List4 {
    public static void main(String[] args) {
        LinkedList mylist=new LinkedList();
        mylist.add(100);
        mylist.add(200);
        mylist.add("Jeenia");
        mylist.add(400);
        mylist.add(500);
        mylist.add(100);
        mylist.add(100);
        mylist.add(300);
        mylist.add(300);
        /*System.out.println("Removing the first element of the list : "+ mylist.removeFirst());
        System.out.println("The list after operation: "+mylist);
        System.out.println("Removing the last element of the list : "+mylist.removeLast());
        System.out.println("The list after second remove operation : "+mylist);
        System.out.println("Removing the first occurrance of value 300 "+mylist.removeFirstOccurrence(300));
        System.out.println("The list after third remove operation : "+mylist);
        System.out.println("Removing the last occurrance of 100 "+mylist.removeLastOccurrence(100));
        System.out.println("The list after fourth remove operation : "+mylist);
        System.out.println("Replace the value "+mylist.set(1,4000)+" with value 4000");
        System.out.println("The list after replacement : "+mylist);*/
        /*System.out.println("The current list size is: "+mylist.size());
        System.out.println("Converting the linkedlist to array object..........");*/
        System.out.println("The list elements are as follows...........");
        Iterator itrr=mylist.iterator();
        while(itrr.hasNext()){
            System.out.println(itrr.next());
        }
        /*System.out.println("The array elements are as follows...........");
        Object [] n=mylist.toArray();
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }*/
        System.out.println("The array elements are as follows...........");
        Object [] m= new Object[mylist.size()];
        mylist.toArray(m);
        for(int j=0;j<m.length;j++){
            System.out.println(m[j]);
        }
    }
}
