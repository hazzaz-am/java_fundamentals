package Conditions;

import java.util.Scanner;

public class InputSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter num: ");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (n == 0) {
                    System.out.println("Total: " + sum);
                    break;
                } else {
                    sum += n;
                    System.out.println("Sum: " + sum);
                }
            } else {
                System.out.println("Please enter a valid number!");
                in.next();
            }

        }
    }
}
