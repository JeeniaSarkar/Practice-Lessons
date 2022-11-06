import java.util.HashMap;

public class Test_HashMap {
    public static void main(String[] args) {
        HashMap <Integer,String> hmap=new HashMap<>();
        hmap.put(100,"Java");
        hmap.put(200,"C++");
        hmap.put(300,"PHP");
        hmap.put(400,"JavaScript");

        HashMap <Integer,String> hmap1=new HashMap<>();
        hmap1.put(500,"Oracle");
        hmap1.put(600,"PL/SQl");
        hmap1.put(700,"Python");

        hmap.putAll(hmap1);
        System.out.println("The merged keys of Hashmaps are : "+hmap.keySet());
        System.out.println("The merged values of HashMap are : "+hmap.values());
    }
}
