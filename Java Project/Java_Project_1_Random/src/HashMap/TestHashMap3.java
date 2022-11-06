package HashMap;

import java.util.HashMap;

public class TestHashMap3 {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<>();
        System.out.println("The value returned when the key is absent : "+hm.putIfAbsent(1,"Jeenia") );
        System.out.println("The value returned when the key is absent : "+hm.putIfAbsent(2,"Jayanti") );
        System.out.println("After value insertion the map looks like : "+hm.toString());
        System.out.println("The value returned when the key is already present : "+hm.putIfAbsent(1,"Jiban 1"));
        System.out.println("After the try to insert value for an alreday existing key the map looks like : "+hm.toString());
    }
}
