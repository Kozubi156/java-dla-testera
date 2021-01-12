package model;

public class User {
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

    public void setEmail(String email) {
        this.email = email;
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

    public void showAllUserInformation(){
        System.out.println(firstName+" "+lastName+", email: "+email+", ma lat: "+age+", czy jest dorosły: "+isAdult);
    }

    public int getUserAge(){
        return age;
    }

    public boolean isAdult(){
        return age >= 18;
    }

    public void greetings(String firstName){
        System.out.println("Hi "+firstName);
    }

    public void greetings(String firstName,String lastName){
        System.out.println("Hi "+firstName+" "+lastName);
    }

    public void greetings(String firstName,String lastName, int age){
        System.out.println("Hi "+firstName+" "+lastName);
    }
}
