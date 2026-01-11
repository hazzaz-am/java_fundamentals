package ArraysPractice;

import java.util.Scanner;

public class PrintIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = input.nextInt();
        System.out.print("Desire Number: ");
        int desire = input.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + i + " : ");
            array[i] = input.nextInt();
        }


        for (int i = 0; i < array.length; i++) {
            if (array[i] == desire) {
                System.out.println("Desire number found at " + i);
                return;
            } else {
                if (i == array.length - 1) {
                    System.out.println("Desire number not found");
                }
            }
        }
    }
}