package LearnInterface;

public class MainVehicle {
    public static void main(String[] args) {
        Bicycle bicycle=new Bicycle();
        bicycle.changeGear(5);
        bicycle.setSpeed(10);
        bicycle.speedUp(5);
        bicycle.applyBrake(2);
        bicycle.printState();

        Bike bike=new Bike();
        bike.changeGear(2);
        bike.setSpeed(3);
        bike.speedUp(1);
        bike.applyBrake(1);
        bike.printState();
    }
}
