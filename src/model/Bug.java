package model;

public class Bug {

    private String bugDescription;
    private String email;
    private int priority;
    private boolean isActive;

    public Bug(String bugDescription, String email, int priority) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.priority = priority;
        this.isActive = true;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10){
            System.out.println("Bug description should contains not less than 10 characters");
        } else {this.bugDescription = bugDescription;}
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

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        if (priority >= 1 && priority <= 5) {
            this.priority = priority;
        } else {
            System.out.println("Wrong bug piority. Set bug piority from range 1 to 6");
        }
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void showBugDetails() {
        System.out.println(bugDescription + " " + email + " " + priority + " " + isActive);
    }

    public void showBugReporterEmail() {
        System.out.println("model.Bug reported email: " + email);
    }

    public void showBugStatus() {
        System.out.println("Is bug active: " + isActive);
    }


}
