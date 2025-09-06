import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.println();

        for (int i = 0; i <= n; i++) {
            System.out.println("*");
        }
    }
}
