package Conditions;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you base: ");
        int b = in.nextInt();
        System.out.print("Enter you height: ");
        int h = in.nextInt();

        double result = 0.5 * (b * h);
        System.out.println(result);
    }
}
