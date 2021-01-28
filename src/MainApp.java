import enums.WeekDays;
import exceptions.IllegalEmailFormatException;
import model.Bug;
import model.BugReporter;
import model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {


//        List<String> names = new ArrayList<>();
//        names.add("Jan");
//        names.add("Tomek");
//        names.add("Marcin");
//
//        names.stream()
//                .filter(name -> name.startsWith("a"))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("Can not find any names with given parameters"));


        User user = new User("Genek", "Dupa", "genek@pl", 34);

        user.setEmail("janusz");

    }

}

