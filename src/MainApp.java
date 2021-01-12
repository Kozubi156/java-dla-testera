import model.Bug;
import model.User;

public class MainApp {
    public static void main(String[] args) {

        Bug bug = new Bug("Page is doesn't load", "tester1@gmail.com", 5);
        bug.setEmail("nowyemail@.pl");
        System.out.println(bug.getEmail());
        bug.setBugDescription("assfsfdsffsfddfsdfsddf");
        System.out.println(bug.getBugDescription());
        bug.setPriority(0);

    }
}

