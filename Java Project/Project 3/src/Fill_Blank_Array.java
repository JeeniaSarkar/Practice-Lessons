import java.util.Locale;

public class Fill_Blank_Array {
    public static void main(String[] args) {
        String [] charArray={"A","_","i","_","u"};
        for(int i=0;i<charArray.length;i++){
            if(charArray[i].equals("_")){
                String preValue=charArray[i-1].toLowerCase(Locale.ROOT);

                switch (preValue){
                    case "a":
                        charArray[i]="e";
                        break;
                    case "e":
                        charArray[i]="i";
                        break;
                    case "i":
                        charArray[i]="o";
                        break;
                    case "o":
                        charArray[i]="u";
                        break;

                }
            }
        }
        for (String a:charArray
             )
        {
            System.out.println(a);
        }
    }
}
