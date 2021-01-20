import computer.Computer;
import computer.Laptop;
import computer.PC;

public class MainApp {
    public static void main(String[] args) {

        Computer officeComputer = new PC("Office computer 1","HP",500,128,true);
        Computer gamingLaptop = new Laptop("XGames","HP GAMES",500,256,50);

        officeComputer.volumeUp(60);
        System.out.println(officeComputer.getVolumeLevel());
        officeComputer.volumeUp(0);
        System.out.println(officeComputer.getVolumeLevel());



    }
}

