package OOP.Singleton;

public class SingletonClass {
    private static SingletonClass instance;
    int age = 24;
    String name = "Hazzaz Abdul Mannan";
    String designation = "Software Developer";

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}