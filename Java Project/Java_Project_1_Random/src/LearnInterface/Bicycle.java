package LearnInterface;

public class Bicycle implements Vehicle{
    int gear;
    int speed;

    @Override
    public void changeGear(int gear) {
        this.gear=gear;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }

    @Override
    public void speedUp(int increment) {
        speed=speed+increment;
    }

    @Override
    public void applyBrake(int decrement) {
        speed=speed-decrement;
    }
    public void printState(){
        System.out.println("The gear of Bicycle is : "+gear+"\n"+"The speed of Bicycle is : "+speed);
    }
}
