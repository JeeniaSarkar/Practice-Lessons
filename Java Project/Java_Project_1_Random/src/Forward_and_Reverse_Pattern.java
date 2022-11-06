public class Forward_and_Reverse_Pattern {
    public static void main(String[] args) {
        int i=1;
        boolean value=true;
        while((i<=5) && (i>=1)){//i=4
            int j=1;
            while((j<=i) && (j>=1)){//j=1
                System.out.print("*");
                    j++;
                }
           System.out.println();
            if(value==true) {
                i++;//i=6
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
