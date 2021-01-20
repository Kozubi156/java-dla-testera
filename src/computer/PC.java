package computer;

public class PC extends Computer {

    private boolean isConnectedToPowerSupply;

    public PC(String name, String type, Hdd hdd, Ram ram, boolean isConnectedToPowerSupply) {
        super(name, type, hdd, ram);
        this.isConnectedToPowerSupply = isConnectedToPowerSupply;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    public int volumeUp() {
        if (volumeLevel >= 100) {
            volumeLevel = 100;
            System.out.println("Max volume level 100 reached");
        } else {
            volumeLevel += 5;
        }
        return volumeLevel;
    }

    @Override
    public int volumeUp(int volumeValue) {
        if(volumeValue > 0) {
            if (volumeLevel >= 100) {
                volumeLevel = 100;
                System.out.println("Max volume level 100 reached");
            } else {
                volumeLevel += volumeValue;
            }
        } else {
            System.out.println("Wrong number, only positive numbers are allowed");
        }
        return volumeLevel;
    }


    @Override
    public int volumeDown() {
        if (volumeLevel <= 0) {
            volumeLevel = 0;
            System.out.println("Volume level 0 reached");
        } else {
            volumeLevel -= 10;
        }
        return volumeLevel;
    }

    @Override
    public int volumeDown(int volumeValue) {
        if (volumeValue > 0) {
            if (volumeLevel <= 0) {
                volumeLevel = 0;
                System.out.println("Volume level 0 reached");
            } else {
                volumeLevel -= volumeValue;
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
        System.out.println("Wyłczam PC: "+ name);
        isTurnOn = false;
    }

    public void setPowerSupply(boolean powerSupplyAttached) {
        isConnectedToPowerSupply = powerSupplyAttached;
    }

}
