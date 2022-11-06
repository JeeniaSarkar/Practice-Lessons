package HashMap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap5 {
    public static void main(String[] args) {
        /*HashMap <String, Integer> hm1=new HashMap<>();
        hm1.put("Jeenia",100);
        hm1.put("Jayanti",200);
        hm1.put("Jiban",300);
        System.out.println("Printing the Map Object : "+hm1);
        //converting the map into set representation
        System.out.println("The Set Representation of Map is...."+hm1.entrySet());
        //Getting the key set of the Hashmap
        System.out.println("The key set representation of Map...."+hm1.keySet());*/

        Map <Integer,String> map1=new HashMap<Integer, String>();
        /*System.out.println(map1.put(1,"A"));
        System.out.println(map1.put(1,"B"));*/

        /*map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");
        map1.put(4,"D");


        Map<Integer, String> map2=new HashMap<>();
        map2.put(1,"E");
        map2.put(2,"F");
        map2.put(5,"G");
        map2.put(6,"H");

        map1.putAll(map2);
        System.out.println(map1.remove(1));
        System.out.println(map1.remove(10));

        System.out.println(map1);*/

        Map <Integer,String> mp=new HashMap<>();
        mp.put(1,"A");
        mp.put(2,"B");
        mp.put(3,"C");
        mp.put(4,"D");
        //System.out.println(mp.values());
        /*System.out.println(mp.getOrDefault(3,"Z"));
        System.out.println(mp.getOrDefault(26,"Z"));*/

        System.out.println("The Map is : "+mp);
        System.out.println("Trying to add a value for a not existing key. "+mp.putIfAbsent(5,"E"));
        System.out.println("The Map after first operation. "+mp);
        System.out.println("Trying to add a value for an existing key. "+mp.putIfAbsent(5,"F"));
        System.out.println("The Map after second operation. "+mp);
    }
}
