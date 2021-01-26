import model.computer.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();
        computers.add(new Laptop("MB PRO 1","PRO 1", new Hdd("HP",500), new Ram("HP", 128),100));
        computers.add(new Laptop("MB PRO 2","PRO 2", new Hdd("HP",500), new Ram("HP", 128),100));
        computers.add(new Laptop("MB PRO 3","PRO 3", new Hdd("HP",256), new Ram("HP", 128),100));
        computers.add(new Laptop("MB PRO 4","PRO 4", new Hdd("HP",500), new Ram("HP", 128),100));
        computers.add(new PC("PC 1","BBB",new Hdd("HP",500), new Ram("HP", 128),true));
        computers.add(new PC("PC 1","AAA",new Hdd("HP",256), new Ram("HP", 256),true));
        computers.add(new PC("PC 2","PRO 3",new Hdd("HP",500), new Ram("HP", 128),true));

        //1. Zliczyc wszystkie komputery, które maja wiecej niż 128 gb ramu
        long countByRamSize = computers.stream()
                .filter(computer -> computer.getRam().getSize() > 128)
                .count();
        System.out.println(countByRamSize);

        //2. Wyswietlic na konsole wszystkie typy komputerów - map
        List<String> computersType = computers.stream()
                .map(Computer::getType)
                .collect(Collectors.toList());
        System.out.println(computersType);

        //3. Wyswietlic komputer ktory ma najwiecej ramu

        Optional<Computer> maxRam = computers.stream()
                .max(Comparator.comparingInt(computer -> computer.getRam().getSize()));

        if(maxRam.isPresent()){
            System.out.println(maxRam.get());
        } else {
            System.out.println("Cannot find such element");
        }

        //4 Utworzyc nowa kolekcje z komuputerami, które maja dysk twardy mniejszy niż 500gb

        List<Computer> computersByHddSize = computers.stream()
                .filter(computer -> computer.getHdd().getSize() < 500)
                .collect(Collectors.toList());

        System.out.println(computersByHddSize);

        //5. Posortowac komutery po nazwie i typie

        List<Computer> sortedComputers = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());

        System.out.println(sortedComputers);


    }
}

