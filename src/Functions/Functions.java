package Functions;

import java.util.Scanner;

public class Functions {
    public static void printName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        printName(name);
    }
}
