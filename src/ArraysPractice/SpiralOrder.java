package ArraysPractice;


import java.util.Scanner;

public class SpiralOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int r = input.nextInt();
        System.out.print("Enter column number: ");
        int c = input.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter numbers: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = input.nextInt();
            }
        }


        int row_start = 0;
        int row_end = r - 1;
        int col_start = 0;
        int col_end = c - 1;

        while (row_start <= row_end && col_start <= col_end) {
            // print column
            for (int col = col_start; col <= col_end; col++) {
                System.out.print(matrix[row_start][col] + " ");
            }
            row_start++;

            // print row
            for (int row = row_start; row <= row_end; row++) {
                System.out.print(matrix[row][col_end] + " ");
            }
            col_end--;

            // print column
            for (int col = col_end; col >= col_start; col--) {
                System.out.print(matrix[row_end][col] + " ");
            }
            row_end--;

            // print row
            for (int row = row_end; row >= row_start; row--) {
                System.out.print(matrix[row][col_start] + " ");
            }
            col_start++;
            System.out.println();
        }
    }
}