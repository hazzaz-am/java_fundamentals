package Patterns;

import java.util.Scanner;

public class NumericalHollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row numbers: ");
        int r = sc.nextInt();
        System.out.print("column numbers: ");
        int c = sc.nextInt();

        // 12345
        // 1   5
        // 1   5
        // 12345
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == c) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}