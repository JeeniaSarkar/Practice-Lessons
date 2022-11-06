package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iterate_HashMap {
    public static void main(String[] args) {
        HashMap< Integer,String> hmap=new HashMap<>();
        hmap.put(1,"Jeenia");
        hmap.put(2,"Jeenia 2");
        hmap.put(3,"Jeenia 3");
        hmap.put(4,"Jeenia 4");
        hmap.put(5,"Jeenia 5");
        //Iterate 1
        for (Map.Entry mp:hmap.entrySet())
        {
            System.out.println("Key: "+mp.getKey()+"  "+"Value: "+mp.getValue());
        }
        //Iterate 2
        //Get Keys and Values separately
        for (Integer k: hmap.keySet()){
            System.out.println("The keys are : "+k);
        }
        for(String v:hmap.values()){
            System.out.println("The values are : "+v);
        }
        //Ierator 3
        Iterator <Map.Entry<Integer,String>> itr=hmap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer,String> entry=itr.next();
                System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
            }
        }
}
