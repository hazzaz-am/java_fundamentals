package OOP;

public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        System.out.println("Static Block runs");
        b = a * 5;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b += 4;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}