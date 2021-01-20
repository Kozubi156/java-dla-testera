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

    public int volumeUp() {
        volumeLevel += 5;
        if (volumeLevel >= 100) {
            volumeLevel = 100;
            System.out.println("Max volume level 100 reached");
        }
        return volumeLevel;
    }

    @Override
    public int volumeUp(int newVolumeLevel) {
        if (newVolumeLevel > 0) {
            volumeLevel += newVolumeLevel;
            if (volumeLevel >= 100) {
                volumeLevel = 100;
                System.out.println("Max volume level 100 reached");
            }
        } else {
            System.out.println("Wrong number, only positive numbers are allowed");
        }
        return volumeLevel;
    }


    @Override
    public int volumeDown() {
        volumeLevel -= 5;
        if (volumeLevel >= 100) {
            volumeLevel = 100;
            System.out.println("Volume level 0 reached");
        }
        return volumeLevel;
    }

    @Override
    public int volumeDown(int volumeValue) {
        if (volumeValue > 0) {
            volumeLevel -= volumeValue;
            if (volumeLevel >= 100) {
                volumeLevel = 100;
                System.out.println("Volume level 0 reached");
            }
        } else {
            System.out.println("Wrong number, only positive numbers are allowed");
        }
        return volumeLevel;
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
        System.out.println("Wyłczam PC: " + name);
        isTurnOn = false;
    }

    public void setPowerSupply(boolean powerSupplyAttached) {
        isConnectedToPowerSupply = powerSupplyAttached;
    }

}
