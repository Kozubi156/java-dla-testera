package computer;

public class PC extends Computer {

    private boolean isConnectedToPowerSupply;

    public PC(String name, String type, int hdd, int ram, boolean isConnectedToPowerSupply) {
        super(name, type, hdd, ram);
        this.isConnectedToPowerSupply = isConnectedToPowerSupply;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isConnectedToPowerSupply) {
            super.switchOn();
        } else {
            System.out.println("Coumputer is not connected to power suply");
        }
    }

    public void setPowerSupply(boolean powerSupplyAttached) {
        isConnectedToPowerSupply = powerSupplyAttached;
    }

}
