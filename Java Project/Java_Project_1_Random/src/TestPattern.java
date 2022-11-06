public class TestPattern {
    public static void main(String[] args) {
        int i=1;
        boolean value=true;
        while(i<=5 && i>=1){
            int j=1;
         while(j<=i & j>=1){
             System.out.print("1");
                j++;
         }
            System.out.println();
         if(value==true) {
             i++;
         }
         else{
             i--;
         }
         if(i>5){
            i--;
            value=false;
         }
        }
    }
}
