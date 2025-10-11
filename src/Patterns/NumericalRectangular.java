package Patterns;

import java.util.Scanner;

public class NumericalRectangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add row: ");
        int r = sc.nextInt();

        // 1234567
        // 2345671
        // 3456712
        // 4567123
        // 5671234
        // 6712345
        // 7123456
        for (int i = 1; i <= r; i++) {
            for (int j = i; j <= r; j++) {
                System.out.print(j);
            }

            for (int k = 1; k <= i - 1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}