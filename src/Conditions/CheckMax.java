package Conditions;

import java.util.Scanner;

public class CheckMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter number: ");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (n == 0) {
                    break;
                } else {
                    if (n > largest) {
                        largest = n;
                    }
                }
                System.out.println("Largest: " + largest);
            } else {
                System.out.println("Enter number!!");
                in.next();
            }
        }
        System.out.println("Largest number: " + largest);
    }
}
