import java.util.*;

public class Test_HashMap3 {
    public static void main(String[] args) {
        HashMap <Integer,Integer> map1=new HashMap<>();
        Integer key=2;
        Integer value=0;
        int length=0;
        do {
            map1.put(key,value);
            key = key + 5;
            value = value + 1;
            length++;
        }
        while(length<10);
        //System.out.println(map1);
        Set <Integer> mySet=map1.keySet();
        System.out.println(mySet);
        ArrayList <Integer> array1=new ArrayList<>(mySet);
        Collections.sort(array1);
        System.out.println(array1);


        Collection <Integer> myValue=map1.values();
        ArrayList <Integer> array2=new ArrayList<>(myValue);
        Collections.sort(array2);
        System.out.println(array2);
        Map <Integer,Integer> result=new TreeMap<>();
        for (int i=0;i<10;i++){
            Integer v1= array1.get(i);
            Integer v2=array2.get(i);
            result.put(v1,v2);

        }
        System.out.println(result);

    }


}
