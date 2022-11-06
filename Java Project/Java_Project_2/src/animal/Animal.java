package animal;

public class Animal {
    private static int legs=4;
    private static int eyes=2;
    private static int tail=1;
    private static int ears=2;
    protected String bodyColour;
    public Animal(){

    }
    public Animal(String bodyColour){
        System.out.println(bodyColour);
        this.bodyColour=bodyColour;
    }
    public static String bodyParts(){
        return ("It has "+Animal.legs+" legs "+Animal.eyes+" eyes "+Animal.ears+" ears "+Animal.tail+" tail.");
    }
    public String getBodyColour(){
     return this.bodyColour;
    }

}
