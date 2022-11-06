package mypackage;

public class String_Concat {
    public static void main(String[] args) {
        String [] names=new String[5];
        String [] names2=new String[5];
        names[0]="Hello";
        names[1]="How";
        names[2]="are";
        names[3]="you";
        names[4]="?";
        for(int i=0; i<names.length;i++)
        {
             names2[i]=names[i];
            System.out.print(names2[i]+" ");
        }

    }
}
