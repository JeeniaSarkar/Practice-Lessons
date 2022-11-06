package HashMap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap1 {
    public static void main(String[] args) {
        HashMap <Integer,String> hm=new HashMap<>();
        hm.put(001,"Jeenia");
        hm.put(002,"Ishani");
        hm.put(003,"Parna");
        hm.put(004,"Jaya");
        System.out.println("Iterating through HashMap");
        for(Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey() + "   " + m.getValue());

        }
            System.out.println("Values after replacing the value for key 002.....");
        hm.put(002,"Rahul");
            for(Map.Entry m2:hm.entrySet()){
                System.out.println(m2.getKey()+"      "+m2.getValue());
            }
        System.out.println("Printing the Map Object Directly........");
        System.out.println(hm.toString());
        }
    }


