import java.util.Scanner;

public class StringsLec {
    public static void main(String[] args) {
        String my_name = "Hazzaz";

        System.out.println(my_name);

        System.out.println(my_name.length());
        System.out.println(my_name.charAt(0));
        System.out.println(my_name.codePointAt(2));

        for (int i = 0; i < my_name.length(); i++) {
            System.out.println(my_name.charAt(i));
        }

        for (int i = 0; i < my_name.length(); i++) {
            if (my_name.codePointAt(i) >= 58 && my_name.codePointAt(i) <= 98) {
                System.out.print(i);
                System.out.println(my_name.charAt(i));
            }
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println();

        System.out.println(name.equals(my_name));

    }
}
