package ArrayList;

import java.util.ArrayList;


public class ArrayListDEmo3 {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist1=new ArrayList<>(5);
        arraylist1.add(1001);
        arraylist1.add(1002);
        arraylist1.add(1003);
        arraylist1.add(1004);
        arraylist1.add(1005);
        //System.out.println("Displaying the size of arraylist : "+arraylist1.size());
        //Iterating through the ArrayList
        /*for(int element3:arraylist1){
            System.out.println("The number is: "+element3);
        }*/
        //Remove the element 1003 which is ath the second index.
        //arraylist1.remove(2);
        arraylist1.remove(new Integer(1005));
    System.out.println("Now iterating through the remaining elements: ");
        System.out.println(arraylist1);
        /*for(int element4: arraylist1){
            System.out.println("The number is : "+element4);
        }*/
        /*arraylist1.add(2,1003);
        arraylist1.add(1006);
        arraylist1.add(1007);
        arraylist1.add(1008);
        arraylist1.add(1009);
        arraylist1.add(10010);
                //remove 10010
        //System.out.println(arraylist1.remove(10010));
        System.out.println(arraylist1);
        //remove specific object from arraylist
        ArrayList<String> strlist=new ArrayList<>(5);
        strlist.add("a");
        strlist.add("b");
        strlist.add("c");
        strlist.add("d");
        strlist.add("e");
        strlist.add("f");
        //Iterate through array elements
        System.out.println("Iteration before remove............");
        for (String a:strlist){
            //System.out.println("The string is: "+a);
        }
        //strlist.remove("e");
        //Now again iterate over the arraylist
        System.out.println("Iteration after remove............");
        for(String b:strlist){
            //System.out.println("The string is: "+b);
        }*/




    }
}
