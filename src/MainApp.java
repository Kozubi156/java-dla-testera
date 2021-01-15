import model.Bug;
import model.User;
import utils.StringUtils;
import utils.WeekUtils;

import java.util.Map;

public class MainApp {
    public static void main(String[] args) {

        User user1 = new User("Paweł", "Robak", "robal@gmail.com", 80);
        User user2 = new User("Paweł", "Robak", "robal@gmail.com", 80);
        User user3 = new User("Paweł", "Robak", "robal@gmail.com", 80);
        User user4 = new User("Paweł", "Robak", "robal@gmail.com", 80);
        User user5 = new User("Paweł", "Robak", "robal@gmail.com", 80);

        System.out.println(StringUtils.getFormattedText("sfdfjdhfdkjhdfjdkdsjkdsfs"));

        System.out.println(WeekUtils.MONDAY);


    }
}

