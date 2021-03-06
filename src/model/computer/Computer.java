package model.computer;

abstract public class Computer {

    protected String name;
    protected String type;
    protected Hdd hdd;
    protected Ram ram;
    protected boolean isTurnOn;
    protected int volumeLevel;

    public Computer(String name, String type, Hdd hdd, Ram ram) {
        this.name = name;
        this.type = type;
        this.hdd = hdd;
        this.ram = ram;
        this.isTurnOn = false;
        this.volumeLevel = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }


    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public void switchOn() {
        System.out.println("SUPER ustawiam pole isTurnOn na true");
        isTurnOn = true;
    }


    public void switchOff() {
        System.out.println("Wyłczam komputer: " + name);
        isTurnOn = false;
    }

    public abstract int volumeUp();


    public int volumeUp(int newVolumeLevel) {
        checkIfNumberIsPositive(newVolumeLevel);
        volumeLevel += newVolumeLevel;
        maxVolumeLevel();
        return volumeLevel;
    }

    public int maxVolumeLevel() {
        if (volumeLevel >= 100) {
            volumeLevel = 100;
            System.out.println("Max volume level 100 reached");
        }
        return volumeLevel;
    }

    public abstract int volumeDown();

    public int volumeDown(int newVolumeLevel) {
        checkIfNumberIsPositive(newVolumeLevel);
        volumeLevel -= newVolumeLevel;
        minVolumeLevel();
        return volumeLevel;
    }

    private int checkIfNumberIsPositive(int newVolumeLevel) {
        if(newVolumeLevel<=0){
            System.out.println("Number is not positive");
        } else {
            return newVolumeLevel;
        }
        return newVolumeLevel;
    }


    public int minVolumeLevel() {
        if (volumeLevel <= 0) {
            volumeLevel = 0;
            System.out.println("Min volume level 0 reached");
        }
        return volumeLevel;
    }


    public boolean isTurnOn() {
        return isTurnOn;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", isTurnOn=" + isTurnOn +
                ", volumeLevel=" + volumeLevel +
                '}';
    }
}
