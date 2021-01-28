import enums.Gender;
import model.Bug;
import model.BugReporter;
import model.User;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) throws IOException {

        List<User> users = new ArrayList<>();
        User user1 = new User("Janusz", "Testowy", "janusz@gmail.com", 45, Gender.M);
        User user2 = new User("Anna", "Bugowa", "anna@gmail.com", 23, Gender.F);
        User user3 = new User("Tadeusz", "Kejsowy", "tadeusz@gmail.com", 76, Gender.M);
        User user4 = new User("Zygmunt", "Planowy", "zygmunt@gmail.com", 54, Gender.M);
        User user5 = new User("Kasia", "Defektowa", "kasia@gmail.com", 31, Gender.F);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        users.stream()
                .filter(gender -> gender.getGender().equals(Gender.F))
                .forEach(User::showAllUserInformation);


        //creating names file using names from users arry list
        List<String> usersNames = users.stream()
                .map(User::getFirstName)
                .collect(Collectors.toList());

        FileWriter fileWithNames = new FileWriter("names.txt");

        BufferedWriter namesFile = new BufferedWriter(fileWithNames);
        for (String name : usersNames) {
            namesFile.write(name);
            namesFile.newLine();
        }
        namesFile.close();

        //read names to list
        List<String> namesList = new ArrayList<>();
        BufferedReader readFile = new BufferedReader(new FileReader("names.txt"));
        String line;
        while ((line = readFile.readLine()) != null) {
            namesList.add(line);
        }

        //find name is stream
        namesList.stream()
                .filter(name -> name.equals("Marzena"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Can not find given name"));

        //bug exception test
        Bug bug1 = new Bug("Deesn't work", new BugReporter("Jan", "Tesciak", "tesciak@gmail.com"), 4);
        bug1.setPriority(0);

    }

}

