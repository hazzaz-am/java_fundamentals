package Conditions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();

        int factorial = 1;
        for (int i = n; i > 1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
