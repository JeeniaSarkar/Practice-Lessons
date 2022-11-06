package Array;

public class Remove_duplicate_elements {
    public static void main(String[] args) {
        int first_array []= {10,11,12,10,11,13};
        int second_array[]=new int[6];
        int temp;

        for (int i=0;i<first_array.length;i++) //i=2
        {
            temp=first_array[i]; //temp=12
            boolean match=false;
            //System.out.println(temp);
            for(int j=i+1;j<second_array.length;j++) //j=5
            {

                if(first_array[j]==temp) //12==11
                {
                    match=true;
                    break;

                }
                else {
                    match=false;
                }

            }
            if(match==false)
            {
                second_array[i]=temp;
            }
        }
        for (int result:second_array) {
            System.out.println(result);
        }
    }
}
