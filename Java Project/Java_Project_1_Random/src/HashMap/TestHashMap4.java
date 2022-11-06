package HashMap;

import java.util.HashMap;

public class TestHashMap4 {
    public static void main(String[] args) {
        //Already existing HashMap
        HashMap <Integer,String> hm1=new HashMap<>();
        hm1.put(1,"A");
        hm1.put(2,"A");
        hm1.put(3,"A");
        hm1.put(4,"A");
        hm1.put(5,"A");
        System.out.println("The old hashmap is : "+hm1.toString());
        //Copy the old hashmap to new one.
        HashMap <Integer,String> hm2=new HashMap<>();
        hm2.putAll(hm1);
        System.out.println("The new hashmap is : "+hm2.toString());
    }
}
