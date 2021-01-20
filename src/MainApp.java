import computer.*;
import model.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MainApp {
    public static void main(String[] args) {


        Hdd hdd = new Hdd("ADATA", 500);
        Ram ram = new Ram("GOODRAM", 16);

        Computer PC = new PC("Office PC", "Working PC", new Hdd("KINGSTON", 800), new Ram("SANDISC", 400), true);
        System.out.println(PC.getHdd().getBrand());

        Computer laptop = new Laptop("Office laptop 1", "Working laptop", hdd, ram, 90);
        System.out.println(laptop.toString());
        System.out.println(laptop.getRam().getSize());


    }
}

