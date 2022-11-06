package Array;

public class MUlti_dimentioal_array {
    public static void main(String[] args) {
        int [][] flats=new int[2][3];
        //System.out.println("Assigning value to ground floor flats//");
        flats[0][0]=100;
        flats[0][1]=101;
        flats[0][2]=102;
        //System.out.println("Assigning value to first floor flats//");
        flats[1][0]=200;
        flats[1][1]=201;
        flats[1][2]=202;
        //System.out.println("The length of flats array: "+flats.length);
        //System.out.println("The length of array in index 0 is : "+ flats[0].length);
        //System.out.println("The length of array in index 1 is : "+ flats[1].length);

        for (int i=0;i<flats.length;i++)  //2<2
        {
            //System.out.println(flats[i]); //array reference of first array index
            for (int j=0;j<flats[i].length;j++) //3<3
            {
                System.out.print(flats[i][j]+" ");//100 ,101, 102 //200, 201

            }
            System.out.println();
        }
    }
}
