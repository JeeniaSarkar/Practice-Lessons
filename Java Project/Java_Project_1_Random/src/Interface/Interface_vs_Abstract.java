package Interface;
interface Vehicle{ //declaring an interface
    void runVahicle();
}
class Scooty implements Vehicle{ //Implementing the interface
    @Override
    public void runVahicle() {
        System.out.println("Scooty runs with or without petrol");
    }
}
abstract class MotorVehicle{ //declaring an abstract class
    abstract void runMotorVehicle(); //declaring abstract method
}
class Bike extends MotorVehicle{
    @Override
    void runMotorVehicle() { //implememting the abstract method within an abstract class
        System.out.println("Motor Vehicles run on Petrol");
    }
}

public class Interface_vs_Abstract {
    public static void main(String[] args) {
    Scooty scooty1=new Scooty();
    scooty1.runVahicle();
    Bike bike1=new Bike();
    bike1.runMotorVehicle();
    }
}
