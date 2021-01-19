package computer;

public class Laptop extends Computer {

    private int batteryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }

    public int volumeUp() {
        return volumeLevel += 5;
    }

    @Override
    public int volumeUp(int volume) {
        if (volume > 0 && volume <= 100) {
            volumeLevel = volumeLevel + volume;
            if (volumeLevel >= 100) {
                volumeLevel = 100;
            }
            return volumeLevel;
        } else {
            System.out.println("Wrong number, inputed value should be from range 0-100");
        }
        return volumeLevel;
    }


    @Override
    public int volumeDown() {
        volumeLevel -= 2;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown(int volume) {
        if (volume > 0 && volume <= 100) {
            volumeLevel = volumeLevel - volume;
            if (volumeLevel >= 100) {
                volumeLevel = 100;
            }
            return volumeLevel;
        } else {
            System.out.println("Wrong number, inputed value should be from range 0-100");
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
