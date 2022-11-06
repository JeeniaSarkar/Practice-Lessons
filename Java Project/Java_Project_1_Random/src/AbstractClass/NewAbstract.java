package AbstractClass;

public abstract class NewAbstract {
    String string1;
    String string2;
    NewAbstract(String string1,String string2){
        this.string1=string1;
        this.string2=string2;
    }
    public abstract void abstractMethod();
    public String nonAbstractMethod(){
        return (string1+" "+string2);
    }

}
