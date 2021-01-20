import computer.*;
import model.Bug;
import model.BugReporter;
import model.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MainApp {
    public static void main(String[] args) {

        Bug bug1 = new Bug("Aplication doesn't work",new BugReporter("Paweł","Testowy","paweltestowy@gmail.com"),4);
        bug1.showAllBugDetails();
        System.out.println(bug1.getBugReporter());


    }
}

