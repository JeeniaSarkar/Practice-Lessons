package HashMap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap2 {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(10,"Jeenia 1");
        hm.put(11,"Jeenia 2");
        hm.put(12,"Jeenia 3");
        hm.put(13,"Jeenia 4");
        hm.put(14,"Jeenia 5");
        System.out.println("The values of the HashMap is as follows........" );
        for (Map.Entry h: hm.entrySet()){
            System.out.println(h.getKey()+" "+h.getValue());
        }
        System.out.println("Trying to add a value for a key that is absent in the Map...");
        System.out.println(hm.putIfAbsent(15,"Jayanti 1"));//If the key doesn't already exist, it returns null.

        for(Map.Entry h1:hm.entrySet()){
            System.out.println(h1.getKey()+" "+h1.getValue());
        }
        System.out.println("Trying to add value for a key already present in the Map");
        System.out.print("The already existing value is...");
        System.out.println(hm.putIfAbsent(13,"Jayanti 3"));// If value is already existing in the Key. It returns the value of the key.
        for (Map.Entry h2:hm.entrySet()){
            System.out.println(h2.getKey()+" "+h2.getValue());
        }
    }
}
