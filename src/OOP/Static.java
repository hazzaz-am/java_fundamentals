package OOP;

public class Static {
    public static void main(String[] args) {
        callFunc();
        Static mainClass = new Static();
        mainClass.greeting();
    }

    static void callFunc() {
        Static mainClass = new Static();
        mainClass.message();
    }

    void message() {
        greeting();
    }

    void greeting() {
        System.out.println("Good, Morning");
    }
}