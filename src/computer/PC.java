package computer;

public class PC extends Computer {

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
    }

    public void showComputerName(){
        System.out.println(name);
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        super.switchOn();
    }
}
