package Array;

public class Array_assignments {
    public static void main(String[] args) {

        //find sum of array elements

        /*float [] numbers={5.5f,10.5f,15.5f,20.5f,25.5f};
        float sum=0.0f;
        for(int i=0;i<numbers.length;i++){
            sum=(sum+numbers[i]);
        }
        System.out.println("The sum based on the array elements is : "+sum);*/

        //Find specific element in array

        /*int [] number1={1,2,3,4,5};
        int check_number=4;
        int index=0;
        boolean matchFound=false;
        for (int i=0; i<number1.length;i++){
            if(number1[i]==check_number){
               matchFound=true;
               index =i;
               break;
            }
            else{
                matchFound=false;
            }
        }
        if(matchFound){
            System.out.println("The given number "+check_number+ " is found in the array at index "+index);
        }
        else {
            System.out.println("The given number "+check_number+ " is not found in array");
        }*/

        //Calculate Average of array elements using for each loop

        /*int [] marks={5,10,15,20,25};
        int total=0;
        int average=0;
        for(int element: marks){

            total = total+element;
        }
        average=total/marks.length;
        System.out.println("The average of array elements is : "+average);*/

    }

}
