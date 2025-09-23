package Conditions;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        String str = in.nextLine();
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i > 0; i--) {
            reversed.append(str.charAt(i));
        }

        System.out.println(reversed);
    }
}
