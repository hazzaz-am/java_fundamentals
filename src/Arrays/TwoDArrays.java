package Arrays;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = input.nextInt();
        System.out.print("Enter column: ");
        int col = input.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter " + i + " " + j + " : ");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("-----------");
        System.out.print("Find Number: ");
        int findNumber = input.nextInt();
        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (findNumber == matrix[i][j]) {
                    System.out.println("Found at index: " + i + j);
                }
            }
        }
    }
}
