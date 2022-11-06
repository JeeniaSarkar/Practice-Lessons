package HashMap;

import java.util.HashMap;

public class Hashmap_Methods {
    public static void main(String[] args) {
        HashMap<String, String> hmap = new HashMap<String, String>();
        hmap.put("Name", "Jeenia");
        hmap.put("Father", "Jiban");
        hmap.put("Mother", "Jayanti");
        hmap.put("Address", "Habra");
        hmap.put("Office", "Kolkata");
        hmap.put("Designation","QA1");

        System.out.println("The hashmap elements are : "+hmap);

        //Remove the hashmap elements
        /*hmap.clear();
        System.out.println("HashMap elements after removing hashmap elements are : "+hmap);*/
        //cloning the hasmap elements

        /*System.out.println("The cloned hashmap is: "+hmap.clone());*/

        //Check if the Hashmap contains specific key or not

        /*System.out.println("Check if the hashmap contains key Kolkata? "+hmap.containsKey("Kolkata"));
        System.out.println("Check if the hashmap contains key address? "+hmap.containsKey("Office"));

        //Check if the hashmap contains specific value or not

        System.out.println("Check if the hashmap contains value Jeenia? "+hmap.containsValue("Jeenia"));
        System.out.println("Check if the hashmap contains value Name? "+hmap.containsValue("Name"));*/

        /*System.out.println("The set representation of hashmap objects : "+hmap.entrySet());

        System.out.println("The object based on key 'Name' is : "+hmap.get("Name"));*/

        /*System.out.println("Check if the hashmap is empty or not? "+hmap.isEmpty());*/

        HashMap <String,String> hmap2=new HashMap<>();
        hmap2.put("Other","Other Details");
       /* System.out.println("Chcek if the hashmap is empty of not? "+hmap2.isEmpty());

        System.out.println("The keys present in hashmap are : "+hmap.keySet());*/

        System.out.println("Putting new value to hmap......"+hmap.put("Designation","QA2"));
        System.out.println("Now the hashmap looks like : "+hmap);
        System.out.println("Initial Hashmap2 object looks like : "+hmap2);
        hmap2.putAll(hmap);
        System.out.println("The new hmap2 object looks like : "+hmap2);
        System.out.println("Removing value of key 'Other' from hmap2.....");
        System.out.println("The removed value is ...."+hmap2.remove("Other"));
        System.out.println("Trying to remove value for a none existing key..."+hmap2.remove("Invalid"));
        System.out.println("Now the hmap2 looks like : "+hmap2);
        System.out.println("Size of the hmap2 is : "+hmap2.size());
        System.out.println("The values available in hmap2 are : "+hmap2.values());
    }
}
