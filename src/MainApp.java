import computer.Laptop;
import computer.PC;

public class MainApp {
    public static void main(String[] args) {

        PC officeComputer = new PC("Office computer","HP",500,128,true);
        Laptop gamingLaptop = new Laptop("XGames","HP GAMES",500,256,50);

//        gamingLaptop.setBatteryLevel(0);
//        gamingLaptop.switchOn();
//        System.out.println(gamingLaptop.isTurnOn());

        officeComputer.setPowerSupply(false);
        officeComputer.switchOn();
        System.out.println(officeComputer.isTurnOn());

    }
}

