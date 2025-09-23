package Conditions;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter width: ");
        int w = in.nextInt();
        System.out.print("Enter height: ");
        int l = in.nextInt();

        double result = w * l;
        System.out.println(result);
    }
}
