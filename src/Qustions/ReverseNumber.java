package Qustions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;

        while (n > 0) {
            int num = n % 10;
            ans = ans * 10 + num;
            n /= 10;
        }
        System.out.println(ans);
    }
}
