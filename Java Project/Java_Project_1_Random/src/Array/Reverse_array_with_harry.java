package Array;

public class Reverse_array_with_harry {
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=5;
        arr[1]=4;
        arr[2]=3;
        arr[3]=2;
        arr[4]=1;
        System.out.println("Forward Array Elements: ");
        for (int value1: arr)
        {
            System.out.print(value1+" ");

        }
        System.out.println();
        int temp;
        int steps=Math.floorDiv(arr.length,2);
        int l=arr.length;
        for (int i=0;i<steps;i++){ //
            temp=arr[i]; // i=0 l-1-i=4 temp=arr[0] =5  //i=1 l-1-i=4-1=3 temp=arr[1]=4
            arr[i]=arr[l-1-i]; //arr[0]= arr[4]=1 //arr[1]=arr[3]=2
            arr[l-1-i]=temp;//arr[4]=arr[0]=5 //arr[3]=4
            //1,2,3,4,5
        }
        System.out.println("Reversed Array Elements: ");
        for(int value2: arr){
            System.out.print(value2+" ");
        }
    }
}
