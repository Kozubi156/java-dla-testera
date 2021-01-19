import computer.Computer;
import computer.Laptop;
import computer.PC;

public class MainApp {
    public static void main(String[] args) {

        Computer officeComputer = new PC("Office computer 1","HP",500,128,true);
        Computer gamingLaptop = new Laptop("XGames","HP GAMES",500,256,50);


//        System.out.println(gamingLaptop.volumeUp());
//        System.out.println(gamingLaptop.volumeDown());
//        System.out.println(gamingLaptop.volumeDown());
//        System.out.println(gamingLaptop.volumeDown());
//        System.out.println(gamingLaptop.volumeDown());
//        System.out.println(gamingLaptop.volumeDown());
//
//        System.out.println("----------------------------------------");
//



        gamingLaptop.volumeUp(-10);
        System.out.println(gamingLaptop.getVolumeLevel());

        gamingLaptop.volumeUp(30);
        System.out.println(gamingLaptop.getVolumeLevel());

        gamingLaptop.volumeUp(5);
        System.out.println(gamingLaptop.getVolumeLevel());

        gamingLaptop.volumeUp(9);
        System.out.println(gamingLaptop.getVolumeLevel());

        gamingLaptop.volumeUp(101);
        System.out.println(gamingLaptop.getVolumeLevel());

        gamingLaptop.volumeDown(120);
        gamingLaptop.volumeDown(30);
        System.out.println(gamingLaptop.getVolumeLevel());






    }
}

