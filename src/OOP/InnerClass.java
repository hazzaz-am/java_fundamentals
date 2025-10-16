package OOP;


public class InnerClass {
    public static void main(String[] args) {
        StaticInnerClass obj1 = new StaticInnerClass("Hazzaz");
        StaticInnerClass obj2 = new StaticInnerClass("Amin");
        obj2.name = "Hujjat";
        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }

    static class StaticInnerClass {
        String name;

        public StaticInnerClass(String name) {
            this.name = name;
        }
    }
}