package Conditions;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        int reversedn = 0;
        int count = n;

        while (count > 0) {
            int digit = count % 10;
            reversedn = (reversedn * 10) + digit;
            count /= 10;
        }

        if (n == reversedn) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
