import computer.Computer;
import computer.Laptop;
import computer.PC;

public class MainApp {
    public static void main(String[] args) {

        Bug bug1 = new Bug("Aplication doesn't work",new BugReporter("Paweł","Testowy","paweltestowy@gmail.com"),4);
        System.out.println(bug1);
        System.out.println(bug1.getBugReporter());
        System.out.println(bug1.getIsActive());
        bug1.setBugStatus(false);

    }
}

