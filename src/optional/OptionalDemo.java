package optional;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class OptionalDemo {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Janusz", "Filipiak", "filipak@gmail.com", 11));
        users.add(new User("Janusz", "Ananas", "filipak@gmail.com", 67));
        users.add(new User("Genek", "Testowy", "testowy@gmail.com", 13));
        users.add(new User("Marcin", "Wisia", "wisnia@gmail.com", 43));
        users.add(new User("Mateusz", "Vatowski", "vatowski@gmail.com", 11));
        users.add(new User("Krzysztof", "Dombrowski", "dombrowski@gmail.com", 90));
        users.add(new User("Janusz", "Filipiak", "janusz@gmail.com", 65));

//        Optional<User> max = users.stream()
//                .max(Comparator.comparingInt(User::getUserAge));
//
//
//        if(max.isPresent()){
//            System.out.println(max.get());
//        } else {
//            System.out.println("nie znalazłem takiego elemtnu");
//        }

//        String nameMarcin = users.stream()
//                .map(User::getFirstName)
//                .filter(name -> name.equals("Marcin"))
//                .findFirst()
//                .orElse("Nie ma Marcina na liscie");
//
//        System.out.println(nameMarcin);
//
//        Integer age = users.stream()
//                .map(User::getAge)
//                .max(Integer::compareTo)
//                .orElse(-1);
//
//
//        System.out.println(age);

//        User Bartek = users.stream()
//                .filter(name -> name.getFirstName().startsWith("B"))
//                .findFirst()
//                .orElseGet(() -> new User("Bartek", "Testowy", "testowy@gmail.com", 45));
//
//        System.out.println(Bartek);

//        User Bartek = users.stream()
//                .filter(name -> name.getFirstName().startsWith("B"))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("Na liscie nie ma usera któremu imie zaczyna sie na B"));

//        users.stream()
//                .filter(name -> name.getFirstName().startsWith("J"))
//                .findFirst()
//                .ifPresent(user -> System.out.println(user));


        users.stream()
                .filter(name -> name.getFirstName().startsWith("Z"))
                .findFirst()
                .ifPresentOrElse(user -> System.out.println(user), () -> System.out.println("Nie ma takiego usera"));

    }
}
