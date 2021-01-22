import model.Bug;
import model.BugReporter;
import model.User;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        List<Bug> bugs = new ArrayList<>();

        bugs.add(new Bug("Aplication doesn't work", new BugReporter("Paweł", "Testowy", "paweltestowy@gmail.com"), 4));
        bugs.add(new Bug("System doesn't work", new BugReporter("Tadeusz", "Testowy", "paweltestowy@gmail.com"), 4));
        bugs.add(new Bug("Page is no loading", new BugReporter("Gerald", "Testowy", "paweltestowy@gmail.com"), 4));
        bugs.add(new Bug("Aplication doesn't work", new BugReporter("Paweł", "Testowy", "paweltestowy@gmail.com"), 4));

        Set<Bug> uniqueBugs = new HashSet<>(bugs);

        Set<Bug> sortedBugs = new TreeSet<>(uniqueBugs);

        for (Bug bug : sortedBugs) {

            System.out.println(bug.getBugDescription());

        }



    }
}

