package Qustions;

import java.util.Scanner;

public class FindOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        int find = in.nextInt();
        int count = 0;

        while (n > 0) {
            long num = n % 10;
            if (num == find) {
                count++;
            }
            n = n / 10;
        }

        System.out.println(count);
    }
}
