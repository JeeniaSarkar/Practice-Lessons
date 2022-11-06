package ArrayList;

import java.util.ArrayList;

public class Test_ArrayList_Random {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>(10);
        arrayList.add("Red");
        arrayList.add("Blue");
        arrayList.add("Yellow");
        arrayList.add("Green");
        arrayList.add("White");
        arrayList.add("Black");
        arrayList.add("Brown");
        arrayList.add("Purple");

        for(String colour: arrayList){
            System.out.println(colour);
        }
    }

}
