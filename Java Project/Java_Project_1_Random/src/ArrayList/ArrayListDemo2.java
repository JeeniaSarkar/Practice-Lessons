package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList <String> stringlist =new ArrayList<String>(5);
        stringlist.add("Java");
        stringlist.add("C++");
        stringlist.add("Python");
        stringlist.add("Ruby");
        stringlist.add("Java");

        //iterating through arraylist elements
        /*for(String elementstring: stringlist){
            System.out.println("The elements of arraylist : "+elementstring);
        }

        //check if the list is empty or not, if not clear it.
        boolean checkempty;
        checkempty=stringlist.isEmpty();
        if(checkempty){
            System.out.println("The arraylist is empty.");
        }
        else {
            System.out.println("Is the arraylist empty ? :" + checkempty);
            stringlist.clear();
            System.out.println("Now checking if the array got empty after clear: "+stringlist.isEmpty());
        }*/

        //returning the first index of object in arraylist
        //System.out.println("The index of keyword java: "+stringlist.indexOf("Java"));
        //Check the last index of any specific object
        //System.out.println("The last index of object java is : "+stringlist.lastIndexOf("Java"));
        //if the element is not present in arraylist
        //System.out.println("The index of specific object in arraylist : "+stringlist.indexOf("ABC"));

        //get Array Element based on index
        //System.out.println("The array element is : "+stringlist.get(3));

        //get array index based on element
        //System.out.println("The array index of Python is: "+stringlist.indexOf("Python"));

        //clone arraylist
        /*ArrayList<String > stringlist2=new ArrayList<String>();
        System.out.println("Size of the string array initially: "+stringlist2.size());
        stringlist2=(ArrayList) stringlist.clone();
        System.out.println("Size of the array after storing the cloned one: "+stringlist2.size());
        System.out.println("Iterate through the new cloned array reference: ");
        for(String element: stringlist2){
            System.out.println(element);
        }
        */

        //Check the contains method
        /*boolean retreval;
        retreval=stringlist.contains("Java");
        if(retreval){
            System.out.println("The specific element is present in the list");
        }
        else {
            System.out.println("The specific element is missing in the list");
        }*/

        //increase the initial capacity of arraylist
        //stringlist.ensureCapacity(20);


    }
}
