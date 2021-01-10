public class Bug {

    String bugDescription;
    String email;
    int priority;
    boolean isActive;

    Bug(String bugDescription, String email, int priority){
        this.bugDescription = bugDescription;
        this.email = email;
        this.priority = priority;
        this.isActive = true;
    }

    void showBugDetails(){
        System.out.println(bugDescription +" "+ email +" "+priority+" "+isActive);
    }

    void showBugReporterEmail(){
        System.out.println("Bug reported email: "+ email);
    }

    void showBugStatus(){
        System.out.println("Is bug active: "+isActive);
    }

    int getBugPiority(){
        return priority;
    }



}
