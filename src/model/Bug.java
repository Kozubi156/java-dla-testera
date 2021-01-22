package model;

import java.util.Objects;

public class Bug implements ConsoleNotification, Comparable<Bug> {

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

    public boolean getIsActive() {
        return isActive;
    }

    public void setBugStatus(boolean newStatus) {
        isActive = newStatus;
        notifyStatusChange();
    }

    public void showAllBugDetails() {
        System.out.println("Bug description: " + bugDescription + ", Bug reporter details: " + bugReporter.getFirstName() + " " + bugReporter.getLastName() + " " + bugReporter.getEmail() + ", priotiry: " + priority + ", Bug is active: " + isActive);
    }

    public void showBugReporterEmail() {
        System.out.println("model.Bug reported email: " + bugReporter.getEmail());
    }

    public void showBugStatus() {
        System.out.println("Is bug active: " + isActive);
    }


    @Override
    public void notifyStatusChange() {
        System.out.println("Bug status was changed, is bug active: "+ isActive);
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", bugReporter=" + bugReporter +
                ", priority=" + priority +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return priority == bug.priority && isActive == bug.isActive && Objects.equals(bugDescription, bug.bugDescription) && Objects.equals(bugReporter, bug.bugReporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bugDescription, bugReporter, priority, isActive);
    }

    @Override
    public int compareTo(Bug bug) {
        return this.getBugDescription().compareTo(bug.getBugDescription());
    }
}
