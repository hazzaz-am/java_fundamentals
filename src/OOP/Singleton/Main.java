package OOP.Singleton;

public class Main {
    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();
        System.out.println(obj1.name);
    }
}