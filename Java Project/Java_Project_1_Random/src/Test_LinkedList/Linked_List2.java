package Test_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List2 {
    public static void main(String[] args) {
        LinkedList list2=new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        //System.out.println(list2);
        //now add 0 in first position and 6 in last postion
        list2.addFirst(0);
        list2.addLast(6);
        list2.addLast(6);
        System.out.println("New List: "+list2);

        //clear list
        /*list2.clear();
        System.out.println("After Clear list elements the list looks like: "+list2);*/

        //clone a list

        /*LinkedList cloneList= new LinkedList();
        cloneList=(LinkedList) list2.clone(); //clone method returns Object Class as type
        System.out.println("The cloned list looks as follows: "+cloneList);*/

        //contains method
        //System.out.println("If the list contains 10? "+cloneList.contains(10));
        //System.out.println("If the list contains 5? "+cloneList.contains(5));

        //Iteration in Linked List in forward order

        /*Iterator it=list2.iterator();
        while(it.hasNext()){
            //System.out.println("The elements of list in forward order: "+it.next());
        }
        //System.out.println();
        //Iteration in linked list in descending order
        Iterator it2=list2.descendingIterator();
        while(it2.hasNext()){
            //System.out.println("The elements in list is reverse order: "+it2.next());
        }*/

        //Get the head of a list
        /*System.out.println("The head of the linkedlist is: "+list2.element());
        LinkedList emptylist= new LinkedList();
        /*System.out.println("Trying to get the head of a empty list" );
        System.out.println(emptylist.element());*/

        //get functionalities

        /*System.out.println("The element is index 4 is: "+list2.get(4));
        System.out.println("The first element of list is: "+list2.getFirst());
        System.out.println("The last element of list is: "+list2.getLast());*/

        //find the index of an object
        /*System.out.println("The index of 6 is: "+list2.indexOf(6));
        System.out.println("The last index of 6 is: "+list2.lastIndexOf(6));
        System.out.println("The index of an object, not present in list: "+list2.indexOf(77));
        System.out.println("The index of an object, not present in list: "+list2.lastIndexOf(77));*/

        //ListIterator
       /* ListIterator listiterate=list2.listIterator(1);
        System.out.println("Forward iteration from index 1...............");
        while(listiterate.hasNext()){
            System.out.println("The element is: "+listiterate.next());
        }
        ListIterator listend=list2.listIterator(2);
        System.out.println("Backward Iteration from index 2............");
        while(listend.hasPrevious()){
            System.out.println("The element is: "+listend.previous());
        }*/

        //Offer Method
        /*list2.offer("Last Element entered through offer.");
        Iterator itr=list2.listIterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }*/
       /* list2.addFirst("Add First");
        System.out.println("Use Add First and Print..........");
        Iterator list=list2.iterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }
        list2.offerFirst("Offer First");
        System.out.println("Use Offer First and Print.........");
        Iterator listA=list2.iterator();
        while(listA.hasNext()){
            System.out.println(listA.next());
        }*/
        System.out.println("Use Add Last and Print..........");
        list2.addLast("Add Last");
        Iterator list=list2.iterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }
        System.out.println("Use Offer Last and Print..........");

        list2.offerLast("Offer Last");
        Iterator listA=list2.iterator();
        while(listA.hasNext()){
            System.out.println(listA.next());
        }

    }
}
