package Array;

public class minimum_maximum_of_array {
    public static void main(String[] args) {
        int [] array2={34,-43,2,87,6};
        int max=array2[0];
        for (int i=0;i<array2.length;i++){
            if(array2[i]>max){
                max=array2[i];
            }
        }
        int min=array2[0];
        for(int j=0;j< array2.length;j++){
            if(array2[j]<min){
                min=array2[j];
            }
        }
        System.out.println("Max Number in array: "+ max);
        System.out.println("Minimum Number in array"+min);
    }
}
