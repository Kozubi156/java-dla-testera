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

    public int volumeUp(){
        return volumeLevel += 1;
    }


    @Override
    public int volumeDown() {
        volumeLevel -= 2;
        if (volumeLevel <= 0) {
            return volumeLevel = 0;
        } else {
            return volumeLevel;
        }
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

    @Override
    public void switchOff() {
        System.out.println("Wyłczam PC: "+ name);
        isTurnOn = false;
    }

    public void setPowerSupply(boolean powerSupplyAttached) {
        isConnectedToPowerSupply = powerSupplyAttached;
    }

}
