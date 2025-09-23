package Conditions;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pod = 1;
        int sod = 0;

        while (n > 0) {
            int digit = n % 10;
            pod *= digit;
            sod += digit;
            n /= 10;
        }


        int result = pod - sod;
        System.out.println(result);
    }
}
