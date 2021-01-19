import computer.Computer;
import computer.Laptop;
import computer.PC;

public class MainApp {
    public static void main(String[] args) {

        Computer officeComputer = new PC("Office computer 1","HP",500,128,true);
        Computer gamingLaptop = new Laptop("XGames","HP GAMES",500,256,50);



        gamingLaptop.volumeUp(50);
        gamingLaptop.volumeUp(100);
        gamingLaptop.volumeUp(100);
        System.out.println(gamingLaptop.getVolumeLevel());

        gamingLaptop.volumeDown(20);
        gamingLaptop.volumeDown(20);
        gamingLaptop.volumeDown(200);
        gamingLaptop.volumeDown(200);


    }
}

