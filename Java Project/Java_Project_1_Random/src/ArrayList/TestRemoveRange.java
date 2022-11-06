package ArrayList;

import java.util.ArrayList;

public class TestRemoveRange extends ArrayList<String> {
    public static void main(String[] args) {
    TestRemoveRange remove=new TestRemoveRange();
    remove.add("Java");
    remove.add("Python");
    remove.add("C#");
    remove.add("Ruby");
    remove.add("Javascript");
    for (String c: remove){
        System.out.println("The number is : "+c);
    }
    //Remove range of elements from arraylist Java to Python
        remove.removeRange(0,2); //from index inclusive, to index exclusive
        System.out.println("After remove function the arraylist looks like..............");
        for (String d:remove){
            System.out.println("The number is : "+d);
        }
    }
}
