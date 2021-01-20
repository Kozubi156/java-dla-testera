package computer;

public interface Music {

    String NAME =  "MUSIC";

    void playMusic();
    void pauseMusic();
    void stopMusic();

    default void sayHello(){
        System.out.println("Hello from default method in MUSIC interface");
    }

    static String getName(){
        return NAME;
    }

    private static void privateMethod(){
        System.out.println("hello from provate method");
    }

}
