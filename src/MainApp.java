import computer.Computer;
import computer.Laptop;
import computer.PC;

public class MainApp {
    public static void main(String[] args) {


        Laptop laptop = new Laptop("Laptop 1","Simple work laptop",1000,256,78);


        laptop.playMusic();
        laptop.pauseMusic();
        laptop.stopMusic();

        laptop.sayHelloFromMusic();

        laptop.pauseVideo();
        laptop.pauseVideo();
        laptop.sayHelloFromVideo();



    }
}

