package model;

public class BugReporter {

    private String firstName;
    private String lastName;
    private String email;


    public BugReporter(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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
        if (!email.contains("@")) {
            System.out.println("Wrong email address. Email address should contains @");
        } else {
            this.email = email;
        }

    }


}
