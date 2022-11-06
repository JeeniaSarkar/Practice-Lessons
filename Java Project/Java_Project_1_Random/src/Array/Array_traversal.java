package Array;

public class Array_traversal {
    public static void main(String[] args) {
        int [] numbers= {20,21,22,23,24};
        //traverse in forward order
        System.out.println("Printing array elements in forward order: ");
        for (int i=0;i<numbers.length;i++)

        {

            System.out.println(numbers[i]);
        }
        //traverse in backward order
        System.out.println("Printing array elements in backward order: ");
        for (int j=numbers.length-1;j>=0;j--)

        {

            System.out.println(numbers[j]);
        }
        //forward traverse using for-each loop
        System.out.println("Printing array elements using for-each loop");
        for (int element:numbers) {
            System.out.println(element);
        }
    }
}
