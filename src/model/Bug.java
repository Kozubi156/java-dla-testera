package model;

public class Bug {

    private String bugDescription;
    private BugReporter bugReporter;
    private int priority;
    private boolean isActive;


    public Bug(String bugDescription, BugReporter bugReporter, int priority) {
        this.bugDescription = bugDescription;
        this.bugReporter = bugReporter;
        this.priority = priority;
        this.isActive = true;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("Bug description should contains not less than 10 characters");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    public int getPriority() {
        return priority;
    }


    public void setPriority(int priority) {
        switch (priority) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.priority = priority;
                break;
            default:
                System.out.println("Wrong bug piority. Set bug piority from range 1 to 6");
        }
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void showAllBugDetails() {
        System.out.println("Bug description: " + bugDescription + ", bug reporter details: " + bugReporter.getLastName() + " " + bugReporter.getFirstName() + " " + bugReporter.getEmail() + " " + priority + " " + isActive);
    }

    public void showBugReporterEmail() {
        System.out.println("model.Bug reported email: " + bugReporter.getEmail());
    }

    public void showBugStatus() {
        System.out.println("Is bug active: " + isActive);
    }


}
