package Conditions;

import java.util.Scanner;

public class LCMNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for (int i = max; i <= a * b; i += max) {
            if (i % min == 0) {
                System.out.println(i);
            }
        }

    }
}
