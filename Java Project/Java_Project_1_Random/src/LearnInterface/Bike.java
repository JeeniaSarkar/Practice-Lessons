package LearnInterface;

public class Bike implements Vehicle{
    int speed;
    int gear;

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void changeGear(int gear){
        this.gear=gear;
    }
    public void speedUp(int increment){
        this.speed=speed+increment;
    }
    public void applyBrake(int decrement){
        this.speed=speed-decrement;
    }
    public void printState(){
        System.out.println("The gear of Bike is : "+gear+"\n"+"The speed of Bike is : "+speed);
    }
}
