public class User {
    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    public User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isAdult();
    }

    void showAllUserInformation(){
        System.out.println(firstName+" "+lastName+", email: "+email+", ma lat: "+age+", czy jest dorosły: "+isAdult);
    }

    int getUserAge(){
        return age;
    }

    boolean isAdult(){
        if(age>=18){
            return true;
        } else {
            return false;
        }
    }

    void greetings(String firstName){
        System.out.println("Hi "+firstName);
    }

    void greetings(String firstName,String lastName){
        System.out.println("Hi "+firstName+" "+lastName);
    }

    void greetings(String firstName,String lastName, int age){
        System.out.println("Hi "+firstName+" "+lastName);
    }
}
