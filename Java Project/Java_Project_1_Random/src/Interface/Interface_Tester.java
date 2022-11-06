package Interface;
interface Event{
    public void start();
}
interface Sport{
    public void play();
}
interface Cricket extends Event,Sport{
    public void show();
}

public class Interface_Tester {
    public static void main(String[] args) {
        Cricket obj1=new Cricket() {
            @Override
            public void start() {
                System.out.println("The Cricket Match has started.");
            }
            public void play(){
                System.out.println("The Cricket match is being played.");
            }
            public void show(){
                System.out.println("The show has been started.");
            }

        };
        obj1.start();
        obj1.play();
        obj1.show();
    }
}
