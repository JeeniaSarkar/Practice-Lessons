package Array;

public class Sum_of_2D_array_elements {
    public static void main(String[] args) {
        int [] [] array1={
                {1,2,3},{4,5,6}
        };
        int [][] array2={
                {6,5,4},{3,2,1}
        };
        int [][] result={
                {0,0,0},{0,0,0}
        };
        /*System.out.println("Printing elements of array1: ");
        for(int i=0;i<array1.length;i++){
            //System.out.println(array1[i]);

            for (int j=0;j<array1[i].length;j++)
            {
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Printing elements of array2: ");
        for(int a=0;a<array2.length;a++){
            for(int b=0;b<array2[a].length;b++){
                System.out.print(array2[a][b]+" ");
            }
            System.out.println();
        }*/

        for (int s=0;s<array1.length;s++){ //until s<2
            for (int t=0;t<array1[s].length;t++){
                result[s][t]=array1[s][t]+array2[s][t];
                //System.out.print(result[s][t]+" ");
                }
            //System.out.println();
        }

        //traverse through multi-dimentional array using for each loop
        for( int [] c:result){
            for (int d:c)
            {
                System.out.print(d+ " ");
            }
            System.out.print("\n");
        }
    }
}
// Until t<3 (s=0)
//s=0 t=0
//result [0][0]=array1[0] [0]+array [0] [0]
// s=0 t=1
//result [0][1]=array1[0] [1]+array [0] [1]
// s=0 t=2
//result [0][2]=array1[0] [2]+array [0] [2]

// Until t<3 (s=1)
//s=1 t=0
//result [1][0]=array1[1] [0]+array [1] [0]
// s=1 t=1
//result [1][1]=array1[1] [1]+array [1] [1]
// s=1 t=2
//result [1][2]=array1[1] [2]+array [0] [2]