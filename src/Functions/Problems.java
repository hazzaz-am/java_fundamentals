package Functions;

import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        checkEven(n);
        System.out.println();
        printTable(n);
        System.out.println();
        System.out.println(checkPrimeNumber(n));
    }

    public static void checkEven(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + "is Odd");
        }
    }

    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + i * n);
        }
    }

    public static String checkPrimeNumber(int n) {
        if (n <= 1) {
            return n + " is not prime number";
        }


        for (int i = 2; i < n; i++) {
            if (n % 2 == 0) {
                return n + " is not prime number";
            }
        }

        return n + " prime number";
    }

}