package Class_Object.Class_ComponentsNested_Class;


public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Creating Singleton");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton.getInstance();
    }

}