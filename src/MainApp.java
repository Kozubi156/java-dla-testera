import model.User;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Tomek", "Testowy", "tomek@gmail.com", 78));
        users.add(new User("Genek", "Wisnia", "genek@gmail.com", 43));
        users.add(new User("Paweł", "Radomski", "pawel@gmail.com", 26));
        users.add(new User("Stanisław", "Kowalski", "stanislaw@gmail.com", 19));

        
        Collections.sort(users, Comparator.comparing(User::getFirstName));
        Collections.sort(users, Comparator.comparingInt(User::getAge).reversed());
        for (User user : users) {
            System.out.println(user.getFirstName()+" "+user.getUserAge());
        }




    }
}

