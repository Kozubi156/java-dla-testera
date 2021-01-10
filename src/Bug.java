public class Bug {

    String bugDescription;
    String email;
    int priority;
    boolean isActive;

    Bug(String bugDescription, String email, int priority, boolean isActive){
        this.bugDescription = bugDescription;
        this.email = email;
        this.priority = priority;
        this.isActive = isActive;
    }

    void showBugDetails(){
        System.out.println(bugDescription +" "+ email +" "+priority+" "+isActive);
    }

    void showReporter(){
        System.out.println("Bug reported by: "+ email);
    }

    void showStatus(){
        System.out.println("Is bug active: "+isActive);
    }

    int getPiority(){
        return priority;
    }



}
