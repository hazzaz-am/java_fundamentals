package Patterns;

import java.util.Scanner;

public class HollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number of rows: ");
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }

            if (i == r) {
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print(i);
                }
            } else {
                System.out.print(i);

                for (int k = 1; k < 2 * i - 2; k++) {
                    System.out.print(" ");
                }

                if (i > 1) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}