package Array;

public class Test_array {
    public static void main(String[] args) {
        //declaration and memory allocation separately
        int [] marks;
        marks= new int[5];
        //declaration and memory allocation together
        int [] marks2= new int[5];
        marks2[0]=6;
        marks2[1]=7;
        marks2[2]=8;
        marks2[3]=9;
        marks2[4]=10;
        //System.out.println(marks2[4]); // get specific elements by index
        //declaration and memory allocation and array initialization together
        int [] marks3={1,2,3,4,5};
        for (int i=0;i<marks3.length;i++)
        {
            //System.out.println(marks3[i]);
        }
        float [] float_array= {23.0f, 24.9f, 98.7f};
        for (int j=0;j<float_array.length;j++)
        {
            System.out.println(float_array[j]);
        }
    }
}
