public class MainApp {
    public static void main(String[] args) {

        Bug bug = new Bug("Page doesn't work", "pawel@gmail.com", 5);

        bug.showBugDetails();
        bug.showBugReporterEmail();
        bug.showBugStatus();
        int piority = bug.getBugPiority();
        System.out.println(piority);

    }
}

