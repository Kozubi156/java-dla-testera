import computer.Computer;
import computer.Laptop;
import computer.PC;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {


        User user1 = new User("Paweł", "Testowy", "testowy@gmail.com", 23);
        User user2 = new User("Paweł", "Testowy", "testowy@gmail.com", 23);

        System.out.println(user1.equals(user2));



    }
}

