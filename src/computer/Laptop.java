package computer;

public class Laptop extends Computer {

    private int batteryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }

    public int volumeUp() {
        volumeLevel += 5;
        maxVolumeLevel();
        return volumeLevel;
    }


    @Override
    public int volumeDown() {
        volumeLevel -= 2;
        minVolumeLevel();
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
