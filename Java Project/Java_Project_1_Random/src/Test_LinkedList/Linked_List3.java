package Test_LinkedList;

import java.util.LinkedList;

public class Linked_List3 {
    public static void main(String[] args) {
        LinkedList mylist=new LinkedList();
        mylist.add(100);
        mylist.add(200);
        mylist.add(300);
        mylist.add(400);
        mylist.add(500);
       // System.out.println(mylist.element()); // gives No Such Element Exception if the list is empty
        //System.out.println(mylist.poll()); //returns null if no element found in list
        //LinkedList mylist2=new LinkedList<>();
       /* System.out.println(mylist.peek());// returns null if the list is empty
        System.out.println(mylist.peekFirst());
        System.out.println(mylist.peekLast());*/
        /*System.out.println("The List Elemets are: "+mylist);
        System.out.println("The polled element is: "+mylist.poll());
        System.out.println("After poll, the Elements are: "+mylist);*/

        /*System.out.println("The List Elements are: "+mylist);
        System.out.println("Polled element is: "+mylist.pollFirst());
        System.out.println("After pollfirst, the Elements are: "+mylist);*/

        /*System.out.println("The List Elements are: "+mylist);
        System.out.println("Polled element is: "+mylist.pollLast());
        System.out.println("After polllast, the Elements are: "+mylist);*/
        System.out.println(mylist);
        /*System.out.println("Popped Element: "+mylist.pop());
        System.out.println("List after pop operation: "+mylist);*/

        //mylist.push(999);
        /*System.out.println("After Pushing new element 999 to linked list: ");
        System.out.println(mylist);
        System.out.println("Remove and retrive the head element of list..........");
        System.out.println(mylist.remove());
        System.out.println("List after removing the head element: "+mylist);*/

        System.out.println("Removing value from index 2..........");
        mylist.remove(2);
        System.out.println("After removing value from index 2 list as follows :"+mylist);
        System.out.println("Removing value 400 value from the linked list......");
        int a=400;
        Integer r=Integer.valueOf(a);
        mylist.remove(r);
        System.out.println("Now the list is: "+mylist);

    }
}
