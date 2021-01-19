package computer;

abstract public class Computer {

    protected String name;
    protected String type;
    protected int hdd;
    protected int ram;
    protected boolean isTurnOn;
    protected int volumeLevel;



    public Computer(String name, String type, int hdd, int ram ) {
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

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
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
        System.out.println("Wyłczam komputer: "+ name);
        isTurnOn = false;
    }

    public abstract int volumeUp();

    public abstract int volumeUp(int volume);

    public abstract int volumeDown();

    public abstract int volumeDown(int volume);

    public boolean isTurnOn() {
        return isTurnOn;
    }
}
