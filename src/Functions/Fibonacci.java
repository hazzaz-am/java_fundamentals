package Functions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a + " ");

        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                System.out.print(b + " ");

                int temp = b;
                b = a + b;
                a = temp;
            }
        }
        System.out.println();

    }
}
