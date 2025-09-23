package Conditions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int length = String.valueOf(n).length();
        int nsum = 0;
        int count = n;

        while (count > 0) {
            int digit = count % 10;
            nsum += (int) Math.pow(digit, length);
            count /= 10;
        }


        if (nsum == n) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
