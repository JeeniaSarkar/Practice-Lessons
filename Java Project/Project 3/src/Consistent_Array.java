public class Consistent_Array {

    public static void main(String[] args) {
        int [] array1={11,15,19,23,27};
        boolean isConsistent=true;
        int staticDifference=array1[1]-array1[0];
        for(int i=0;i<array1.length-1;i++){
            int result=array1[i+1]-array1[i];
            if(result!=staticDifference)
            {
                isConsistent=false;
                break;
            }else {
                isConsistent = true;
            }
        }
        System.out.println("The array is consistent ?: "+(isConsistent==true? "yes": "no"));
    }
}