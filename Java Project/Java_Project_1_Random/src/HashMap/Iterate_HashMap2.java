package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iterate_HashMap2 {
    public static void main(String[] args) {
        HashMap<String, String> hmap = new HashMap<String, String>();
        hmap.put("Name", "Jeenia");
        hmap.put("Father", "Jiban");
        hmap.put("Mother", "Jayanti");
        hmap.put("Address", "Habra");
        hmap.put("Office", "Kolkata");

       /*for (Map.Entry entry:hmap.entrySet()){
           System.out.println("Key : "+entry.getKey()+", Value : "+entry.getValue());
       }*/

        /*for(String key:hmap.keySet()){
            System.out.println("The Keys are : "+key);
        }

        for (String value: hmap.values()){
            System.out.println("The values are : "+value);
        }*/

        /*Iterator<Map.Entry<String, String>> itr = hmap.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry <String,String> entry=itr.next();
            System.out.println("Key: "+entry.getKey());
            System.out.println("Value: "+entry.getValue());
        }*/

        //Get KeySet and retrive values based on keysets

        for(String key: hmap.keySet()){
            System.out.println("The value based on the key "+key+ " is - "+hmap.get(key));
        }
    }
}
