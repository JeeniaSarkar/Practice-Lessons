public class Print_Pattern {
    public static void main(String[] args) {
        int length=5;
        for (int i=1;i<length+1;i++){
            //int temp=0;
            for(int j=0;j<i;j++){

                //temp=temp+1;
                if(j==1 && i%2==0){
                    System.out.print("@");

                }
                else{
                    System.out.print("*");
                }

            }

            System.out.println();
        }
    }
}
