public class MainApp {
    public static void main(String[] args) {

        Bug bug = new Bug("Page doesn't work", "pawel@gmail.com", 5, true);

        bug.showBugDetails();
        bug.showReporter();
        bug.showStatus();
        int piority = bug.getPiority();
        System.out.println(piority);

    }
}

