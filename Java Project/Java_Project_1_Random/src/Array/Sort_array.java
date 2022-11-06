package Array;

public class Sort_array {
    public static void main(String[] args) {
        int [] array1={23,20,12,54,7}; //7,23,20,54,12 //7,20,23,54,12// 7,12,23,54,20//7,12,20,54,23//7,12,20,23,54
        int temp=0;
        for (int i=0;i<array1.length;i++){ //i=4
            for (int j=i+1;j<array1.length;j++){ // j=5
                if(array1[j]<array1[i]){ // 23<54
                        temp=array1[i]; // temp=54
                        array1[i]=array1[j]; // array[3]=23
                        array1[j]=temp;// array[4]=54

                }

            }

        }
        for (int element:array1
        ) {
            System.out.println(element);
        }

    }

}
