public class MainApp {
    public static void main(String[] args) {

        User user1 = new User("Janusz","Kowal","kowal@gmail.com",17);
        user1.showAllUserInformation();
        user1.greetings(user1.firstName);


        Bug bug1 = new Bug("Page doesn't work", "pawel@gmail.com", 5);
        bug1.showBugDetails();
        bug1.showBugReporterEmail();
        bug1.showBugStatus();
        int piority = bug1.getBugPiority();
        System.out.println(piority);

    }
}

