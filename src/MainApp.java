import model.Bug;
import model.User;

public class MainApp {
    public static void main(String[] args) {

        User user1 = new User("Paweł","Robak","robal@gmail.com",80);
        User user2 = new User("Paweł","Robak","robal@gmail.com",80);
        User user3 = new User("Paweł","Robak","robal@gmail.com",80);
        User user4 = new User("Paweł","Robak","robal@gmail.com",80);
        User user5 = new User("Paweł","Robak","robal@gmail.com",80);

        User.printUserCounter();

        int userCounter = User.getUserCounter();
        System.out.println(userCounter);

    }
}

