package model;

import exceptions.IllegalEmailFormatException;

import java.util.Objects;

public class User {

    private static int userCounter = 0;

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;

    public User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isAdult();
        userCounter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalEmailFormatException{
        if (!email.contains("@")) {
            throw new IllegalEmailFormatException("Wrong email address. Email address should contains @");
        } else {
            this.email = email;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public void showAllUserInformation() {
        System.out.println(firstName + " " + lastName + ", email: " + email + ", ma lat: " + age + ", czy jest dorosły: " + isAdult);
    }

    public int getUserAge() {
        return age;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public void greetings(String firstName) {
        System.out.println("Hi " + firstName);
    }

    public void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName);
    }

    public void greetings(String firstName, String lastName, int age) {
        System.out.println("Hi " + firstName + " " + lastName);
    }

    public static void printUserCounter() {
        System.out.println(userCounter);
    }

    public static int getUserCounter() {
        return userCounter;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && isAdult == user.isAdult && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, age, isAdult);
    }
}
