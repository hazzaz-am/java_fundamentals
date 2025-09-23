package Conditions;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = in.nextInt();

        double A = Math.PI * Math.pow(r, 2);
        System.out.println(A);
    }
}
