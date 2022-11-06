import java.util.HashMap;

public class Test_HashMap2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>(10);
        for(int i=0;i<10;i++){
            String key="Key"+i;
            Integer value=100+i;
            map.put(key,value);

        }
        System.out.println(map);
    }
}
