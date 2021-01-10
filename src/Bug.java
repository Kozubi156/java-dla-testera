public class Bug {

    String bugDescription;
    String bugReporter;
    int priority;
    boolean isActive;

    Bug(String bugDescription,String bugReporter,int priority,boolean isActive){
        this.bugDescription = bugDescription;
        this.bugReporter = bugReporter;
        this.priority = priority;
        this.isActive = isActive;
    }

    void showBugDetails(){
        System.out.println(bugDescription +" "+bugReporter+" "+priority+" "+isActive);
    }

    void showReporter(){
        System.out.println("Bug reported by: "+bugReporter);
    }

    void showStatus(){
        System.out.println("Is bug active: "+isActive);
    }

    int getPiority(){
        return priority;
    }



}
