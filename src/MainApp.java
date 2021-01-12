import model.User;

public class MainApp {
    public static void main(String[] args) {

        User user = new User("Jan", "Testowy", "jantestowy@gmail.com", 16);

        System.out.println(user.getEmail());
        user.setEmail("nowyemail@gmail.com");
        System.out.println(user.getEmail());
    }
}

