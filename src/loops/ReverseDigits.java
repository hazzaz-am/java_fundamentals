package loops;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            ans = (ans * 10) + lastDigit;
            n /= 10;
        }

        System.out.println("Reverse Digit " + ans);
    }
}