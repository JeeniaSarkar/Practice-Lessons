package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Reverse_Arraylist {
    public static void main(String[] args) {
        String name="Jeenia";
        String [] ar1=name.split("");
        ArrayList<String> al=new ArrayList<>(Arrays.asList(ar1));

        String result="";

        //System.out.println(al);
        for(int i= al.size()-1;i>=0;i--){

            result=result+al.get(i);
        }
        //System.out.println(al2);
        System.out.println(result);
    }
}
