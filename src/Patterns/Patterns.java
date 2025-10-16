package Patterns;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row numbers: ");
        int r = sc.nextInt();
        doublePyramid(r);
    }

    static void doublePyramid(int r) {
        for (int i = 1; i <= 2 * r; i++) {
            int colNumber = i > r ? 2 * r - i : i;
            for (int j = 1; j <= colNumber; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}