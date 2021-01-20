package computer;

public class Laptop extends Computer {

    private int batteryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
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
        System.out.println("Check battery level");
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level to low");
        }

    }

    @Override
    public void switchOff() {
        System.out.println("Wyłczam laptop: " + name);
        isTurnOn = false;
    }


    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }
}
