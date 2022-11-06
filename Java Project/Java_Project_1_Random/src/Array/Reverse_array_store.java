package Array;

public class Reverse_array_store {
    public static void main(String[] args) {
        int [] arr1= {5,4,3,2,1};
        int [] arr2=new int[5];
       for(int i=arr1.length-1;i>=0;i--) //i=4  //i=3  //i=2 //i=1 //i=0
       {
           int differnce=(arr1.length-1)-i; //4-4=0 //4-3=1 //4-2=2 //4-1=3 //4-0=4
           arr2[differnce]=arr1[i]; //arr2[0]=1 arr2[1]=2 arr2[2]=3 arr2[3]=4 arr2[4]=5

       }
        System.out.println("The reverced array looks like: ");
        for (int element: arr2){
            System.out.println(element);
        }
    }
}
