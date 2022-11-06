public class Print_Pattern_2 {
    public static void main(String[] args) {
        int length=5;
        for(int i=length;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
